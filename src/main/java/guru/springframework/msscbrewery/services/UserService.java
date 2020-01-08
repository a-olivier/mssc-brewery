package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.UserDto;

import java.util.UUID;

public interface UserService {
    UserDto getById(UUID id);
}
