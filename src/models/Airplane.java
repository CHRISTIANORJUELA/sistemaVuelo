package models;

public class Airplane {
    private Long id;
    private String modelAirplane;
    private String brandAirplane;
    private DesignAirplaneCabin designAirplaneCabin;
    private ConfigurationSeats configurationSeats;

    public Airplane(Long id,String modelAirplane, String brandAirplane){
        this.id = id;
        this.modelAirplane = modelAirplane;
        this.brandAirplane = brandAirplane;
    }
    public Airplane(Long id, String modelAirplane, String brandAirplane, DesignAirplaneCabin designAirplaneCabin, ConfigurationSeats configurationSeats) {
        this.id = id;
        this.modelAirplane = modelAirplane;
        this.brandAirplane = brandAirplane;
        this.designAirplaneCabin = designAirplaneCabin;
        this.configurationSeats = configurationSeats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelAirplane() {
        return modelAirplane;
    }

    public void setModelAirplane(String modelAirplane) {
        this.modelAirplane = modelAirplane;
    }

    public String getBrandAirplane() {
        return brandAirplane;
    }

    public void setBrandAirplane(String brandAirplane) {
        this.brandAirplane = brandAirplane;
    }

    public DesignAirplaneCabin getDesignAirplaneCabin() {
        return designAirplaneCabin;
    }

    public void setDesignAirplaneCabin(DesignAirplaneCabin designAirplaneCabin) {
        this.designAirplaneCabin = designAirplaneCabin;
    }

    public ConfigurationSeats getConfigurationSeats() {
        return configurationSeats;
    }

    public void setConfigurationSeats(ConfigurationSeats configurationSeats) {
        this.configurationSeats = configurationSeats;
    }
}
