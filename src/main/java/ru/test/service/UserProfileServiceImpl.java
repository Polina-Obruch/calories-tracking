package ru.test.service;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.test.core.exception.EntityNotFoundException;
import ru.test.dto.UserProfileResponseDto;
import ru.test.dto.UserRequestDto;
import ru.test.dto.UserShortDto;
import ru.test.dto.mapper.UserMapper;
import ru.test.entity.Gender;
import ru.test.entity.User;
import ru.test.repository.UserRepository;

@Service
@Validated
@AllArgsConstructor
public class UserProfileServiceImpl implements UserProfileService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public UserShortDto addUser(@Valid UserRequestDto userRequestDto) {
        User user = userMapper.userRequestDtoToUser(userRequestDto);
        user.setBaseMetabolicRate(getBaseMetabolicRate(user.getGender(), user.getWeight(), user.getHeight(), user.getAge()));
        return userMapper.userToUserShortDto(userRepository.save(user));
    }


    @Override
    public void remove(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public UserProfileResponseDto getProfileByUserId(Long userId) {
        return userMapper.userToUserProfileResponseDto(userRepository.findById(userId)
                .orElseThrow(() -> new EntityNotFoundException("User", userId)));
    }


    //Добавить расчет с учетом активности или цели
    private Long getBaseMetabolicRate(Gender gender, int weight, int height, int age) {
        long BMR;

        if (gender == Gender.MALE) {
            BMR = Math.round(88.36 + (13.4 * weight) + (4.8 * height) - (5.7 * age));
        } else {
            BMR = Math.round(447.6 + (9.2 * weight) + (3.1 * height) - (4.3 * age));
        }
        return BMR;
    }
}
