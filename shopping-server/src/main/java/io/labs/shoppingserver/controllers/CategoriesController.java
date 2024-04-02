package io.labs.shoppingserver.controllers;

import io.labs.shoppingserver.controllers.implement.AllCrudController;
import io.labs.shoppingserver.models.Category;
import io.labs.shoppingserver.models.DTOs.CategoryDTO;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import io.labs.shoppingserver.services.CategoriesService;
import org.modelmapper.ModelMapper;

public class CategoriesController  extends AllCrudController<Category, CategoryDTO, Long> {
    private final CategoriesService service;

    private final ModelMapper modelMapper;

    public CategoriesController(CategoriesService service, ModelMapper modelMapper) {
        super(Category.class, CategoryDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected CrudServiceImpl<Category, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }
}
