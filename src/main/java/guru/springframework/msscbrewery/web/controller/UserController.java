package guru.springframework.msscbrewery.web.controller;


import guru.springframework.msscbrewery.services.UserService;
import guru.springframework.msscbrewery.web.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.UUID;

import static java.util.Objects.isNull;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{uuid}")
    public ResponseEntity<UserDto> getUser(@PathVariable("uuid") UUID userId){
        UserDto userDto = userService.getById(userId);

        if(isNull(userDto)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userDto);
    }
}
