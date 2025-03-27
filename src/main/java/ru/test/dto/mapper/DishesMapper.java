package ru.test.dto.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.stereotype.Component;
import ru.test.dto.DishRequestDto;
import ru.test.dto.DishResponseDto;
import ru.test.entity.Dish;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
@Component
public interface DishesMapper {

    Dish dishRequestDtoToDish(DishRequestDto dishRequestDto);

    DishResponseDto dishToDishResponseDto(Dish dish);
}
