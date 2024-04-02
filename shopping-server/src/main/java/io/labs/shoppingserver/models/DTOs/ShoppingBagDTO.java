package io.labs.shoppingserver.models.DTOs;

import jakarta.persistence.OneToMany;

import java.util.List;

public class ShoppingBagDTO {

    @OneToMany
    List<ItemShoppingBagDTO> allProductItems;

    private UserDTO user;
}
