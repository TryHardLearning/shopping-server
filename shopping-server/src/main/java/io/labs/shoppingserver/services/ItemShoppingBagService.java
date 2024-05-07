package io.labs.shoppingserver.services;

import io.labs.shoppingserver.models.ItemShoppingBag;
import io.labs.shoppingserver.repositories.ItemShoppingBagRepository;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemShoppingBagService extends CrudServiceImpl<ItemShoppingBag, Long> {

    private final ItemShoppingBagRepository repository;

    public ItemShoppingBagService(ItemShoppingBagRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<ItemShoppingBag, Long> getRepository() {
        return repository;
    }
}
