package io.labs.shoppingserver.controllers;

import io.labs.shoppingserver.controllers.implement.AllCrudController;
import io.labs.shoppingserver.models.DTOs.ItemShoppingBagDTO;
import io.labs.shoppingserver.models.ItemShoppingBag;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import io.labs.shoppingserver.services.ItemShoppingBagService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("itemshoppingbag")
public class ItemShoppingBagController extends AllCrudController<ItemShoppingBag, ItemShoppingBagDTO, Long> {
    private final ItemShoppingBagService service;

    private final ModelMapper modelMapper;

    public ItemShoppingBagController(ItemShoppingBagService service, ModelMapper modelMapper) {
        super(ItemShoppingBag.class, ItemShoppingBagDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected CrudServiceImpl<ItemShoppingBag, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }
}
