package ru.test.dto.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.stereotype.Component;
import ru.test.dto.UserProfileResponseDto;
import ru.test.dto.UserRequestDto;
import ru.test.dto.UserShortDto;
import ru.test.entity.User;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
@Component
public interface UserMapper {

    User userRequestDtoToUser(UserRequestDto userRequestDto);

    UserShortDto userToUserShortDto(User user);

    UserProfileResponseDto userToUserProfileResponseDto (User user);
}
