package controllers;

import dtos.UserDto;
import models.Users;
import services.UserServiceImplementation;
import services.interfaces.UserService;

public class UserController {

    UserService userServiceImplementation = new UserServiceImplementation();

    public Users userCheckIndatabase(UserDto userDto){
        return userServiceImplementation.processUser(userDto);
    }
}
