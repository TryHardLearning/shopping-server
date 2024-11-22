package io.labs.shoppingserver.services;

import io.labs.shoppingserver.models.ItemShoppingBag;
import io.labs.shoppingserver.models.ShoppingBag;
import io.labs.shoppingserver.repositories.ItemShoppingBagRepository;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemShoppingBagService extends CrudServiceImpl<ItemShoppingBag, Long> {

    private final ItemShoppingBagRepository repository;
    private ShoppingBagService shoppingBagService;

    public ItemShoppingBagService(ItemShoppingBagRepository repository, ShoppingBagService shoppingBagService) {
        this.repository = repository;
        this.shoppingBagService = shoppingBagService;
    }

    @Override
    protected JpaRepository<ItemShoppingBag, Long> getRepository() {
        return repository;
    }

    @Override
    public ItemShoppingBag findById(Long id) {
        return repository.findByUserId(id);
    }

    @Override
    public ItemShoppingBag save(ItemShoppingBag entity) {
        if (entity.getShoppingBag() == null) {
            List<ItemShoppingBag> item = new ArrayList<ItemShoppingBag>();
            item.add(entity);

            ShoppingBag bag = ShoppingBag.builder().items(item).build();
            shoppingBagService.save(bag);
            entity.setShoppingBag(bag);
        }

        return repository.save(entity);
    }
}
