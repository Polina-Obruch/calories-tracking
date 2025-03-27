package ru.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.entity.Dish;

@Repository
public interface DishesRepository extends JpaRepository<Dish, Long> {
}
