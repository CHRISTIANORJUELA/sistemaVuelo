package services;

import dtos.UserDto;
import models.Users;
import services.interfaces.UserService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserServiceImplementation implements UserService {

    private final List<Users> usersList = new ArrayList<>();

    public Optional<Users> checkUser(String identification) {
        return usersList
                .stream()
                .filter(user -> user.getIdentificationUser().equalsIgnoreCase(identification))
                .findAny();
    }

    public Boolean addUser(UserDto userDto) {
        return usersList.add(new Users(userDto.identificationUser(), userDto.nameUser(), userDto.countryUser(), userDto.ageUser(), userDto.electronicCard()));
    }

    public Users processUser(UserDto userDto){
        Optional<Users> usersOptional = checkUser(userDto.identificationUser());
        if(usersOptional.isPresent()){
            return usersOptional.get();
        }
        addUser(userDto);

        return usersList.stream().filter(users -> Objects.equals(users.getIdentificationUser(), userDto.identificationUser())).findAny().get();
    }

}
