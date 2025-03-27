package ru.test.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DishResponseDto {
    private Integer id;
    private String designation;
    private Integer calories;
    private Integer protein;
    private Integer fats;
    private Integer carbs;
}
