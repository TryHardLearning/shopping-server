package io.labs.shoppingserver.models.DTOs;

import io.labs.shoppingserver.models.Category;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class ProductDTO {
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
