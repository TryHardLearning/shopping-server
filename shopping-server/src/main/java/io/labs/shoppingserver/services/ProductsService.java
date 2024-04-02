package io.labs.shoppingserver.services;

import io.labs.shoppingserver.models.Product;
import io.labs.shoppingserver.repositories.ProductsRepository;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductsService extends CrudServiceImpl<Product, Long>  {

    private final ProductsRepository repository;

    public ProductsService(ProductsRepository repository) {
        this.repository = repository;
    }

    @Override
    protected JpaRepository<Product, Long> getRepository() {
        return this.repository;
    }
}
