package io.labs.shoppingserver.services;

import io.labs.shoppingserver.models.ItemShoppingBag;
import io.labs.shoppingserver.models.ShoppingBag;
import io.labs.shoppingserver.models.User;
import io.labs.shoppingserver.repositories.ItemShoppingBagRepository;
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

    private final ItemShoppingBagRepository itemShoppingBagRepository;
    private final ShoppingBagRepository repository;

    public ShoppingBagService(ItemShoppingBagRepository itemShoppingBagRepository, ShoppingBagRepository repository) {
        this.itemShoppingBagRepository = itemShoppingBagRepository;
        this.repository = repository;
    }

    @Override
    protected JpaRepository<ShoppingBag, Long> getRepository() {
        return this.repository;
    }


    @Override
    public ShoppingBag findById(Long id) {
        return repository.findByUserId(id);
    }

    @Override
    public ShoppingBag save(ShoppingBag entity) {
        // Garantir que todos os itens tenham a referência correta
        for (ItemShoppingBag item : entity.getItems()) {
            item.setShoppingBag(entity);
            System.out.println(item.getId());
        }
        return repository.save(entity);
    }
}
