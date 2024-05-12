package services;

import dtos.UserDto;
import models.Flyghts;
import models.Reserved;
import models.Users;
import services.interfaces.ReservedService;

import java.util.ArrayList;
import java.util.List;

public class ReservedServiceImplementation implements ReservedService {

    private final List<Reserved> reservedList = new ArrayList<>();
    private final float TAX = 17f ;
    public String generatedReserved(Users user, Flyghts flyghts){
        reservedList.add(new Reserved(user,flyghts,taxReserved(flyghts.getPriceFlyghts())));
        return reservedList.getLast().toString()+"\n"+" Impuestos del 17% ";
    }

    public float taxReserved(Float priceFlyght){
        return priceFlyght + (priceFlyght * (TAX /100));
    }
}
