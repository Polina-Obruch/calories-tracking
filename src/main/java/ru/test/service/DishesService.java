package ru.test.service;

import jakarta.validation.Valid;
import ru.test.dto.DishRequestDto;
import ru.test.dto.DishResponseDto;

public interface DishesService {

    DishResponseDto addDish(@Valid DishRequestDto dishRequestDto);

    void removeDish(Long dishId);

    DishResponseDto getDishById(Long dishId);
}
