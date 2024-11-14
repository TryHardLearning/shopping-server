package io.labs.shoppingserver.repositories;

import io.labs.shoppingserver.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Category, Long> {
}
