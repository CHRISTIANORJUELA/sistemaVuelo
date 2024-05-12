package models;

public class Airlane {
    private Long id;
    private String nameAirlane;

    public Airlane(Long id, String nameAirlane) {
        this.id = id;
        this.nameAirlane = nameAirlane;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameAirlane() {
        return nameAirlane;
    }

    public void setNameAirlane(String nameAirlane) {
        this.nameAirlane = nameAirlane;
    }
}
