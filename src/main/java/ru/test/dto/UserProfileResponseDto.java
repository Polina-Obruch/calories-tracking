package ru.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.test.entity.Gender;
import ru.test.entity.Goal;

@Getter
@Setter
@AllArgsConstructor
public class UserProfileResponseDto {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private Integer weight;
    private Integer height;
    private Goal goal;
    private Gender gender;
    private Long baseMetabolicRate;
}
