package ru.test.service;


import jakarta.validation.Valid;
import ru.test.dto.UserProfileResponseDto;
import ru.test.dto.UserRequestDto;
import ru.test.dto.UserShortDto;

public interface UserProfileService {

    UserShortDto addUser(@Valid UserRequestDto userRequestDto);

    void remove(Long userId);

    UserProfileResponseDto getProfileByUserId(Long userId);

}
