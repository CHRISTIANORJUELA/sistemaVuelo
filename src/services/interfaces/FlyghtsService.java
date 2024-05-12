package services.interfaces;

import models.Flyghts;

public interface FlyghtsService {
    void initializeDataFlyghts();
    Flyghts searchFly(String departure, String arrive);
}
