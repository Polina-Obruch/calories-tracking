package ru.test.service;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.test.core.exception.EntityNotFoundException;
import ru.test.dto.DishRequestDto;
import ru.test.dto.DishResponseDto;
import ru.test.dto.mapper.DishesMapper;
import ru.test.repository.DishesRepository;

@Service
@Validated
@AllArgsConstructor
public class DishesServiceImpl implements DishesService {
    private final DishesRepository dishesRepository;
    private final DishesMapper dishesMapper;

    @Override
    public DishResponseDto addDish(@Valid DishRequestDto dishRequestDto) {
        return dishesMapper.dishToDishResponseDto(dishesRepository
                .save(dishesMapper.dishRequestDtoToDish(dishRequestDto)));
    }

    @Override
    public void removeDish(Long dishId) {
        dishesRepository.deleteById(dishId);
    }

    @Override
    public DishResponseDto getDishById(Long dishId) {
        return dishesMapper.dishToDishResponseDto(dishesRepository.findById(dishId)
                .orElseThrow(() -> new EntityNotFoundException("Dish", dishId)));
    }
}
