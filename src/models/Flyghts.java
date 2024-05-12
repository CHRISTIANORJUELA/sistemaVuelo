package models;

import java.util.Date;
import java.util.List;

public class Flyghts extends Application {
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

    public Flyghts(Long id, String departure, String arrive, Date hourDeparture, Date hourArrive, Airplane airplane, List<Pack> plansOferted, int ocupedSeats, int limitSeats, Airports airport, Float priceFlyghts) {
        this.id = id;
        this.departure = departure;
        this.arrive = arrive;
        this.hourDeparture = hourDeparture;
        this.hourArrive = hourArrive;
        this.airplane = airplane;
        this.plansOferted = plansOferted;
        this.ocupedSeats = ocupedSeats;
        this.limitSeats = limitSeats;
        this.airport = airport;
        this.priceFlyghts = priceFlyghts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public Float getPriceFlyghts() {
        return priceFlyghts;
    }

    public void setPriceFlyghts(Float priceFlyghts) {
        this.priceFlyghts = priceFlyghts;
    }

    @Override
    public String toString() {
        return "Flyghts{" +
                "departure= " + departure + '\'' +
                ", arrive= " + arrive + '\'' +
                "flyghts= "+ priceFlyghts +"\n"+
                '}';
    }
}
