package builder;

import functionalInterface.Build;
import models.Airplane;
import models.Airports;
import models.Flyghts;
import models.Pack;

import java.util.Date;
import java.util.List;

public class FlygthsBuilder implements Build<Flyghts> {
    private Long id;
    private String departure;
    private String arrive;
    private Date hourDeparture;
    private Date hourArrive;
    private Airplane airplane;
    private List<Pack> plansOferted;
    private int ocupedSeats;
    private int limitSeats;
    private Airports airport;
    private Float priceFlyghts;

    public FlygthsBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public FlygthsBuilder setDeparture(String departure) {
        this.departure = departure;
        return this;
    }

    public FlygthsBuilder setArrive(String arrive) {
        this.arrive = arrive;
        return this;
    }

    public FlygthsBuilder setHourDeparture(Date hourDeparture) {
        this.hourDeparture = hourDeparture;
        return this;
    }

    public FlygthsBuilder setHourArrive(Date hourArrive) {
        this.hourArrive = hourArrive;
        return this;
    }

    public FlygthsBuilder setAirplane(Airplane airplane) {
        this.airplane = airplane;
        return this;
    }

    public FlygthsBuilder setPlansOferted(List<Pack> plansOferted) {
        this.plansOferted = plansOferted;
        return this;
    }

    public FlygthsBuilder setOcupedSeats(int ocupedSeats) {
        this.ocupedSeats = ocupedSeats;
        return this;
    }

    public FlygthsBuilder setLimitSeats(int limitSeats) {
        this.limitSeats = limitSeats;
        return this;
    }

    public FlygthsBuilder setAirport(Airports airport) {
        this.airport = airport;
        return this;
    }

    public FlygthsBuilder setPriceFlyghts(Float priceFlyghts) {
        this.priceFlyghts = priceFlyghts;
        return this;
    }

    @Override
    public Flyghts buildObject() {
        return new Flyghts(id,departure,arrive,hourDeparture,hourArrive,airplane,plansOferted,ocupedSeats,limitSeats,airport,priceFlyghts);
    }
}
