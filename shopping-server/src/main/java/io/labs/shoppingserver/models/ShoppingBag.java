package io.labs.shoppingserver.models;

import jakarta.persistence.OneToMany;

import java.util.List;

public class ShoppingBag {

    @OneToMany
    List<ItemShoppingBag> allProductItems;

    private User user;
}
