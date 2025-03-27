package ru.test.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.test.entity.Gender;
import ru.test.entity.Goal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {

    @NotBlank(message = "Данные об имени пользователя не могут быть пустыми")
    @Size(min = 2, max = 200)
    private String name;

    @Email(message = "Введите правильный email")
    @NotBlank(message = "Данные о почте не могут быть пустыми")
    @Size(min = 6, max = 254)
    private String email;

    @NotNull(message = "Данные о росте не могут быть пустыми")
    @Min(value = 14, message = "Введенный возраст слишком маленький. Возможно ошибка данных")
    @Max(value = 150, message = "Введенный возраст слишком большой. Возможно ошибка данных" )
    private Integer age;

    @NotNull(message = "Данные о весе не могут быть пустыми")
    @Min(value = 1, message = "Вес не может быть отрицательным/нулевым")
    @Max(value = 500, message = "Введенный рост слишком большой. Возможно ошибка данных")
    private Integer weight;

    @NotNull(message = "Данные о росте не могут быть пустыми")
    @Min(value = 50, message = "Рост не может быть отрицательным/нулевым")
    @Max(value = 300, message = "Введенный рост слишком большой. Возможно ошибка данных")
    private Integer height;

    @NotNull(message = "Данные о цели не могут быть пустыми")
    private Goal goal;

    @NotNull(message = "Данные о поле не могут быть пустыми")
    private Gender gender;
}
