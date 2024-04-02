package io.labs.shoppingserver.services;

import io.labs.shoppingserver.models.ShoppingBag;
import io.labs.shoppingserver.repositories.ShoppingBagRepository;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ShoppingBagService extends CrudServiceImpl<ShoppingBag, Long> {

    private ShoppingBagRepository repository;

    public ShoppingBagService(ShoppingBagRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<ShoppingBag, Long> getRepository() {
        return this.repository;
    }
}
