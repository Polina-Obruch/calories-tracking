package ru.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.test.entity.Goal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserShortDto {

    private String name;

    private Goal goal;

    private Long baseMetabolicRate;
}
