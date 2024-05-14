package io.labs.shoppingserver.controllers;

import io.labs.shoppingserver.controllers.implement.AllCrudController;

import io.labs.shoppingserver.models.DTOs.ProductDTO;
import io.labs.shoppingserver.models.Product;
import io.labs.shoppingserver.services.ProductsService;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("products")
public class ProductsController extends AllCrudController<Product, ProductDTO, Long> {
    private final ProductsService service;

    private final ModelMapper modelMapper;

    public ProductsController(ProductsService service, ModelMapper modelMapper) {
        super(Product.class, ProductDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected CrudServiceImpl<Product, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

}
