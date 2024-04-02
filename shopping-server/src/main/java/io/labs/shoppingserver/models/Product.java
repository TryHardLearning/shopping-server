package io.labs.shoppingserver.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    private long Id;

    private String name;

    private String description;

    private String imgLink;

    private Double cost;

    @OneToMany
    private List<Category> categories;

    private Double discount;
}
