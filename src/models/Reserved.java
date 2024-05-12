package models;

public class Reserved {
    private static long autoIncrementId = 0;
    private Long id;
    private Users user;
    private Flyghts flyght;
    private Float totalPrice;

    public Reserved(Users user, Flyghts flyght, Float totalPrice) {
        autoIncrementId += 1;
        this.id = autoIncrementId;
        this.user = user;
        this.flyght = flyght;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Flyghts getFlyght() {
        return flyght;
    }

    public void setFlyght(Flyghts flyght) {
        this.flyght = flyght;
    }

    public Float gettotalPrice() {
        return totalPrice;
    }

    public void settotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Reserved{" +
                "id= " + id +
                ", user= " + user +
                ", flyght= " + flyght +
                ", totalPrice= " + totalPrice +
                '}';
    }
}
