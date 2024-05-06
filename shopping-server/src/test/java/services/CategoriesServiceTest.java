package services;

import io.labs.shoppingserver.models.Category;
import io.labs.shoppingserver.repositories.CategoriesRepository;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriesServiceTest extends CrudServiceImpl<Category, Long> {

    private final CategoriesRepository repository;

    private
}
