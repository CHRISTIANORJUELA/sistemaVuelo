package models;

import java.util.List;

public class Airports {
    private Long id;
    private String nameAirport;
    private String ubication;
    private List<Routes> routesList;

    private Airports(Long id,String nameAirport,String ubication){
        this.id = id;
        this.nameAirport = nameAirport;
        this.ubication = ubication;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameAirport() {
        return nameAirport;
    }

    public void setNameAirport(String nameAirport) {
        this.nameAirport = nameAirport;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }
}
