package io.labs.shoppingserver.utils;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @Builder
public class GenericResponse {

    private String message;

    public GenericResponse(String message) {
        this.message = message;
    }
}
