package ru.test.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DishRequestDto {
    @NotBlank(message = "Данные об имени пользователя не могут быть пустыми")
    @Size(min = 2, max = 400)
    private String designation;

    @NotNull(message = "Данные о калориях не могут быть пустыми")
    @Min(value = 1, message = "Значение калорий не может быть отрицательным/нулевым")
    @Max(value = 5000, message = "Значение калорий слишком большое. Возможно ошибка данных")
    private Integer calories;

    @NotNull(message = "Данные о белках не могут быть пустыми")
    @Min(value = 1, message = "Значение белка не может быть отрицательным/нулевым")
    @Max(value = 500, message = "Значение белка слишком большое. Возможно ошибка данных")
    private Integer protein;

    @NotNull(message = "Данные о жирах не могут быть пустыми")
    @Min(value = 1, message = "Значение жиров не может быть отрицательным/нулевым")
    @Max(value = 500, message = "Значение жиров слишком большое. Возможно ошибка данных")
    private Integer fats;

    @NotNull(message = "Данные об углеводах не могут быть пустыми")
    @Min(value = 1, message = "Значение углеводов не может быть отрицательным/нулевым")
    @Max(value = 500, message = "Значение углеводов слишком большое. Возможно ошибка данных")
    private Integer carbs;
}
