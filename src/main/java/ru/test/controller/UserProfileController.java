package ru.test.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.test.dto.UserProfileResponseDto;
import ru.test.dto.UserRequestDto;
import ru.test.dto.UserShortDto;
import ru.test.service.UserProfileService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/users/profile")
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserShortDto addUser(@RequestBody UserRequestDto userRequestDto) {
        log.info("Запрос на создание профиля пользователя");
        return userProfileService.addUser(userRequestDto);
    }

    @DeleteMapping({"/{userId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeUser(@PathVariable Long userId) {
        log.info("Запрос на удаление профиля пользователя");
        userProfileService.remove(userId);
    }

    @GetMapping({"/{userId}"})
    public UserProfileResponseDto getUserById(@PathVariable Long userId) {
        log.info("Запрос на выдачу профиля пользователя по ID");
        return userProfileService.getProfileByUserId(userId);
    }
}
