package io.labs.shoppingserver.services;

import io.labs.shoppingserver.models.ShoppingBag;
import io.labs.shoppingserver.models.User;
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

    private final UserRepository userRepository;
    private final ShoppingBagRepository repository;
    private final SecurityContext securityContext;

    public ShoppingBagService(UserRepository userRepository, ShoppingBagRepository repository, SecurityContext securityContext) {
        this.userRepository = userRepository;
        this.repository = repository;
        this.securityContext = securityContext;
    }

    private User findUserBySecurityContext(){

        Authentication authentication = securityContext.getAuthentication();

        Object principal = authentication.getPrincipal();

        if (principal != null) {
            return (User) principal;
        }
        return null;
    }

    @Override
    protected JpaRepository<ShoppingBag, Long> getRepository() {
        return this.repository;
    }


    public ShoppingBag findShoppingBag(Long id) throws Exception {
        User findUser = findUserBySecurityContext();

        if (findUser != null && findUser.getUsername() != null) {
            User userLogged = userRepository.findByUsername(findUser.getUsername());
            return repository.findByUserId(userLogged.getId());
        }
        return null;
    }

    @Override
    public List<ShoppingBag> findAll() {
        User findUser = findUserBySecurityContext();

        if (findUser != null && findUser.getUsername() != null) {
            User userLogged = userRepository.findByUsername(findUser.getUsername());
            ShoppingBag userBag = repository.findByUserId(userLogged.getId());
            List<ShoppingBag> shoppingBags = new ArrayList<>();
            shoppingBags.add(userBag);
            return shoppingBags;
        }
        return null;
    }

    @Override
    public ShoppingBag save (ShoppingBag entity) {
        User findUser = findUserBySecurityContext();

        if (findUser != null && findUser.getUsername() != null) {
            User userLogged = userRepository.findByUsername(findUser.getUsername());
            entity.setUser(userLogged);
            return repository.save(entity);
        }
        return null;
    }
}
