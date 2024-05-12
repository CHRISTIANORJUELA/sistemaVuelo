package models;

import java.util.ArrayList;

public class ConfigurationSeats {
 private Long id;
 private int disponibilitySeats;
 private int[][] seatsRepresentedMatriz = new int[2][28];
 private ArrayList<Integer> typeClassPerSeat;

 public ConfigurationSeats(){

 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public int getDisponibilitySeats() {
  return disponibilitySeats;
 }

 public void setDisponibilitySeats(int disponibilitySeats) {
  this.disponibilitySeats = disponibilitySeats;
 }

 public int[][] getSeatsRepresentedMatriz() {
  return seatsRepresentedMatriz;
 }

 public void setSeatsRepresentedMatriz(int[][] seatsRepresentedMatriz) {
  this.seatsRepresentedMatriz = seatsRepresentedMatriz;
 }

 public ArrayList<Integer> getTypeClassPerSeat() {
  return typeClassPerSeat;
 }

 public void setTypeClassPerSeat(ArrayList<Integer> typeClassPerSeat) {
  this.typeClassPerSeat = typeClassPerSeat;
 }
}
