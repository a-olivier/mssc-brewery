package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.UserDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public UserDto getById(UUID id) {
        return UserDto.builder().id(UUID.randomUUID()).name("Bob").build();
    }
}
