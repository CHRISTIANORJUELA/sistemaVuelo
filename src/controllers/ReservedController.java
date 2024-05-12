package controllers;

import dtos.UserDto;
import models.Flyghts;
import models.Users;
import services.ReservedServiceImplementation;
import services.interfaces.ReservedService;

public class ReservedController {

    ReservedService reservedService = new ReservedServiceImplementation();
    public String generatedReserver(Users user, Flyghts flyghts){
        return reservedService.generatedReserved(user,flyghts);
    }
}
