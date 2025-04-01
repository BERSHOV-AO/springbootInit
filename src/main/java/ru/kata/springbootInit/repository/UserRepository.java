package ru.kata.springbootInit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.springbootInit.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository<User, Long> User - класс, Long - id
    //List<User> fineByLastName(String lastName); //пример поиска по фамилии
}
