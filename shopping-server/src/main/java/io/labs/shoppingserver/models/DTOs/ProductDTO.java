package io.labs.shoppingserver.models.DTOs;

import io.labs.shoppingserver.models.Category;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {

    private long Id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    private String imgLink;

    @NotNull
    private Double cost;

    @OneToMany @NotNull
    private List<Category> categories;

}
