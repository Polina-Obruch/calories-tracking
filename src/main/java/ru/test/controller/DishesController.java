package ru.test.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.test.dto.DishRequestDto;
import ru.test.dto.DishResponseDto;
import ru.test.service.DishesService;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/dishes")
public class DishesController {
    private final DishesService dishesService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DishResponseDto addDish(@RequestBody DishRequestDto dishRequestDto) {
        log.info("Запрос на создание блюда");
        return dishesService.addDish(dishRequestDto);
    }

    @DeleteMapping({"/{dishId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeDish(@PathVariable Long dishId) {
        log.info("Запрос на удаление блюда");
        dishesService.removeDish(dishId);
    }

    @GetMapping({"/{dishId}"})
    public DishResponseDto getUserById(@PathVariable Long dishId) {
        log.info("Запрос на выдачу блюда по ID");
        return dishesService.getDishById(dishId);
    }

}
