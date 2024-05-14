package io.labs.shoppingserver.controllers;

import io.labs.shoppingserver.controllers.implement.AllCrudController;

import io.labs.shoppingserver.models.DTOs.UserDTO;
import io.labs.shoppingserver.models.User;
import io.labs.shoppingserver.services.UserService;
import io.labs.shoppingserver.services.implement.CrudServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController extends AllCrudController<User, UserDTO, Long> {

    private final UserService service;

    private final ModelMapper modelMapper;

    public UserController(UserService service, ModelMapper modelMapper) {
        super(User.class, UserDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected CrudServiceImpl<User, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

}
