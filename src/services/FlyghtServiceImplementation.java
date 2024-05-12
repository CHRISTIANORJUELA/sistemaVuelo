package services;

import builder.FlygthsBuilder;
import models.Flyghts;
import services.interfaces.FlyghtsService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlyghtServiceImplementation implements FlyghtsService {
    private final List<Flyghts> listFlyghts = new ArrayList<>();


    @Override
    public void initializeDataFlyghts(){
        if(!listFlyghts.isEmpty()){
            return;
        }
        FlygthsBuilder flygthsBuilder1 = new FlygthsBuilder();
        Flyghts flyghts1 = flygthsBuilder1.setId(1L)
                .setDeparture("BOGOTA")
                .setArrive("MADRID")
                .setPriceFlyghts(4500000F)
                .buildObject();
        FlygthsBuilder flygthsBuilder2 = new FlygthsBuilder();
        Flyghts flyghts2 = flygthsBuilder2.setId(2L)
                .setDeparture("BOGOTA")
                .setArrive("ORLANDO")
                .setPriceFlyghts(2500000F)
                .buildObject();
        FlygthsBuilder flygthsBuilder3 = new FlygthsBuilder();
        Flyghts flyghts3 = flygthsBuilder3.setId(2L)
                .setDeparture("NEW YORK")
                .setArrive("MUNICH")
                .setPriceFlyghts(7500000F)
                .buildObject();
        FlygthsBuilder flygthsBuilder4 = new FlygthsBuilder();
        Flyghts flyghts4 = flygthsBuilder3.setId(2L)
                .setDeparture("TOKIO")
                .setArrive("LONDRES")
                .setPriceFlyghts(9000000F)
                .buildObject();

        listFlyghts.add(flyghts1);
        listFlyghts.add(flyghts2);
        listFlyghts.add(flyghts3);
        listFlyghts.add(flyghts4);
    }

    @Override
    public Flyghts searchFly(String departure,String arrive){
        return listFlyghts
                .stream()
                .filter(flyghts -> lookResults(flyghts,departure,arrive))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Vuelo no encontrado"));
    }

    public boolean lookResults(Flyghts flyghts,String departure,String arrive){
        return (flyghts.getDeparture().equalsIgnoreCase(departure) || flyghts.getDeparture().equalsIgnoreCase(arrive))
                &&
                (flyghts.getArrive().equalsIgnoreCase(departure) || flyghts.getArrive().equalsIgnoreCase(arrive));
    }
}
