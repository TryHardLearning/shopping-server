package io.labs.shoppingserver.repositories;

import io.labs.shoppingserver.models.ItemShoppingBag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemShoppingBagRepository extends JpaRepository<ItemShoppingBag, Long> {
}
