package io.labs.shoppingserver.controllers;

import io.labs.shoppingserver.controllers.implement.AllCrudController;
import io.labs.shoppingserver.models.DTOs.ShoppingBagDTO;
import io.labs.shoppingserver.models.ShoppingBag;
import io.labs.shoppingserver.services.ShoppingBagService;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shoppingbag")
public class ShoppingBagController extends AllCrudController<ShoppingBag, ShoppingBagDTO, Long> {
    private final ShoppingBagService service;

    private final ModelMapper modelMapper;

    public ShoppingBagController(ShoppingBagService service, ModelMapper modelMapper) {
        super(ShoppingBag.class, ShoppingBagDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected CrudServiceImpl<ShoppingBag, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

}
