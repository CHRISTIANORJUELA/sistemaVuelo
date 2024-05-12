package controllers;

import models.Flyghts;
import services.FlyghtServiceImplementation;
import services.interfaces.FlyghtsService;

public class FlyghtsController {

    FlyghtsService flyghtsService = new FlyghtServiceImplementation();
    public Flyghts searchFly(String departure, String arrive){
        flyghtsService.initializeDataFlyghts();
        return flyghtsService.searchFly(departure,arrive);
    }


}
