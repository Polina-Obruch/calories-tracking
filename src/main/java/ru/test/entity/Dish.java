package ru.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "DISHES")
@NoArgsConstructor
public class Dish {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String designation;

    private Integer calories;
    private Integer protein;
    private Integer fats;
    private Integer carbs;
}
