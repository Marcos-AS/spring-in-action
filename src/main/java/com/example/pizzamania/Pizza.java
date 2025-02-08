package com.example.pizzamania;

import java.util.Date;
import java.util.List;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
public class Pizza {
    private Long id;
    private Date createdAt = new Date();
    @NotNull
    @Size(min=5, message="El nombre debe tener al menos 5 caracteres")
    private String name;
    @NotNull
    @Size(min=1, message="Debes elegir al menos 1 ingrediente")
    private List<IngredientRef> ingredients;
}
