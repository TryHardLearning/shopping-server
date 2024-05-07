package io.labs.shoppingserver.services;

import io.labs.shoppingserver.models.ShoppingBag;
import io.labs.shoppingserver.models.User;
import io.labs.shoppingserver.repositories.AuthService;
import io.labs.shoppingserver.repositories.ShoppingBagRepository;
import io.labs.shoppingserver.repositories.UserRepository;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingBagService extends CrudServiceImpl<ShoppingBag, Long> {

    private final ShoppingBagRepository repository;
    private final SecurityContext securityContext;


    public ShoppingBagService(ShoppingBagRepository repository, SecurityContext securityContext) {
        this.repository = repository;
        this.securityContext = securityContext;
    }

    private User findUserBySecurityContext(){

        Authentication authentication = securityContext.getAuthentication();

        Object principal = authentication.getPrincipal();

        if (principal != null) {
            return (User) principal;
        } else {
            throw new RuntimeException("No User Data");
        }
    }

    @Override
    protected JpaRepository<ShoppingBag, Long> getRepository() {
        return this.repository;
    }


    public ShoppingBag findShoppingBag(Long id) {
        User findUser = findUserBySecurityContext();
        return repository.findByUserId(findUser.getId());
    }

    @Override
    public List<ShoppingBag> findAll(){
        User findUser = findUserBySecurityContext();
        ShoppingBag myBag = repository.findByUserId(findUser.getId());
        List<ShoppingBag> shoppingBag = new ArrayList<>();
        shoppingBag.add(myBag);
        return shoppingBag;
    }

    @Override
    public ShoppingBag save (ShoppingBag entity){
        User findUser = findUserBySecurityContext();
        if(entity.getUser() != null && entity.getUser().getId().equals( findUser.getId())){
            return repository.save(entity);
        }
        entity.setUser(findUser);
        return repository.save(entity);
    }
}
