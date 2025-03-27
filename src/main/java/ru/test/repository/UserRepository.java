package ru.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.test.entity.User;


public interface UserRepository extends JpaRepository<User,Long> {

}
