package services.interfaces;

import dtos.UserDto;
import models.Users;

import java.util.Optional;

public interface UserService {
    Optional<Users> checkUser(String identification);

    Boolean addUser(UserDto userDto);

    Users processUser(UserDto userDto);
}
