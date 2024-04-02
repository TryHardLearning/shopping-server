package io.labs.shoppingserver.services;

import io.labs.shoppingserver.models.Category;
import io.labs.shoppingserver.repositories.CategoriesRepository;
import io.labs.shoppingserver.services.CRUD.CrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriesService extends CrudServiceImpl<Category, Long> {

    private final CategoriesRepository repository;

    public CategoriesService(CategoriesRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<Category, Long> getRepository() {
        return repository;
    }
}
