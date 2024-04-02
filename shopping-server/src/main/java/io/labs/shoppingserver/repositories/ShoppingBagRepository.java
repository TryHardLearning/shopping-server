package io.labs.shoppingserver.repositories;


import io.labs.shoppingserver.models.Category;
import io.labs.shoppingserver.models.ShoppingBag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingBagRepository extends JpaRepository<ShoppingBag, Long> {
}
