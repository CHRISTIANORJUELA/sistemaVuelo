import controllers.FlyghtsController;
import controllers.ReservedController;
import controllers.UserController;
import dtos.UserDto;
import models.Flyghts;
import models.Users;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private final static FlyghtsController flyghtsController = new FlyghtsController();
    private final static ReservedController reservedController = new ReservedController();
    private final static UserController userController = new UserController();
    private static Flyghts flyghtsCache;
    private static Map<String,String> dataCache = new HashMap<>();


    public static void main(String[] args) {
        while (true){
            JOptionPane.showMessageDialog(null,"Bienvenido");
            viewSearch();
            if(flyghtsCache != null){
               makeReserve();
            }
        }
    }

    public static void viewSearch(){
        String departure = JOptionPane.showInputDialog("Digite el lugar de salida");
        String arrive = JOptionPane.showInputDialog("Digite el lugar de destino");
        Flyghts flyght = flyghtsController.searchFly(departure,arrive);
        flyghtsCache = flyght;
        System.out.println(flyght.toString());
    }

    public static void makeReserve(){
        String follow = JOptionPane.showInputDialog(null,"¿Desea seleccionar el vuelo? \n si o no");
        if (follow.equalsIgnoreCase("si")){
            UserDto userDto = viewFormReserve();
            Users users = userController.userCheckIndatabase(userDto);
            String reservedMessage =reservedController.generatedReserver(users,flyghtsCache);
            JOptionPane.showMessageDialog(null,reservedMessage);
        }
    }

    public static UserDto viewFormReserve(){
        if(dataCache.isEmpty()){
            String identificationUser = JOptionPane.showInputDialog(null,"Digite su identificación");
            String nameUser = JOptionPane.showInputDialog(null,"Digite su nombre");
            String countryUser = JOptionPane.showInputDialog(null,"Digite su país de residencia");
            int ageUser =  Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su edad"));
            String electronicCard = JOptionPane.showInputDialog(null,"Digite su tarjeta de credito");
            setCache(identificationUser,nameUser,countryUser,ageUser,electronicCard);
            return new UserDto(identificationUser, nameUser, countryUser, ageUser, electronicCard);
        }
        JOptionPane.showMessageDialog(null,"Encontramos una sesión existe, los datos se llenaran automaticamente");
        return new UserDto(
                dataCache.get("identificationUser"),
                dataCache.get("nameUser"),
                dataCache.get("countryUser"),
                Integer.parseInt(dataCache.get("ageUser")),
                dataCache.get("electronicCard"));
    }

    private static void setCache(String identificationUser, String nameUser, String countryUser, int ageUser, String electronicCard) {
        dataCache.put("identificationUser",identificationUser);
        dataCache.put("nameUser",nameUser);
        dataCache.put("countryUser",countryUser);
        dataCache.put("ageUser",String.valueOf(ageUser));
        dataCache.put("electronicCard",electronicCard);
    }
}