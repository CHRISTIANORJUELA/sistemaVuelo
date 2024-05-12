package models;

public class Users{
    private static long autoIncrementId = 0L;
    private Long id;
    private String identificationUser;
    private String nameUser;
    private String countryUser;
    private int ageUser;
    private String electronicCard;

    public Users(){

    }
    public Users(String identificationUser, String nameUser, String countryUser, int ageUser, String electronicCard) {
        Users.autoIncrementId += 1;
        this.id = Users.autoIncrementId;
        this.identificationUser = identificationUser;
        this.nameUser = nameUser;
        this.countryUser = countryUser;
        this.ageUser = ageUser;
        this.electronicCard = electronicCard;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificationUser() {
        return identificationUser;
    }

    public void setIdentificationUser(String identificationUser) {
        this.identificationUser = identificationUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getCountryUser() {
        return countryUser;
    }

    public void setCountryUser(String countryUser) {
        this.countryUser = countryUser;
    }

    public int getAgeUser() {
        return ageUser;
    }

    public void setAgeUser(char ageUser) {
        this.ageUser = ageUser;
    }

    public String getElectronicCard() {
        return electronicCard;
    }

    public void setElectronicCard(String electronicCard) {
        this.electronicCard = electronicCard;
    }

    @Override
    public String toString() {
        return "Users{" +
                ", identificationUser='" + identificationUser + '\'' +
                ", nameUser='" + nameUser + '\'' +
                ", countryUser='" + countryUser + '\'' +
                ", ageUser=" + ageUser +
                '}';
    }
}
