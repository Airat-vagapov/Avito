package tech.itpark.model;

import java.util.ArrayList;

public class Flat {
    private int id;
    private ArrayList<String> stations = new ArrayList<>();
    private ArrayList<String> districts = new ArrayList<>();
    int price;
    int floor;
    int rooms;

//    public Flat(int id, ArrayList<String> stations, ArrayList<String> districts, int minPrice, int maxPrice, int minFloor, int maxFloor, int rooms) {
//        this.id = id;
//        this.stations = stations;
//        this.districts = districts;
////        this.minPrice = minPrice;
////        this.maxPrice = maxPrice;
//        this.minFloor = minFloor;
//        this.maxFloor = maxFloor;
//        this.rooms = rooms;
//    }


    public Flat(int id, ArrayList<String> stations, ArrayList<String> districts, int price, int floor, int rooms) {
        this.id = id;
        this.stations = stations;
        this.districts = districts;
        this.price = price;
        this.floor = floor;
        this.rooms = rooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getStations() {
        return stations;
    }

    public void setStations(ArrayList<String> stations) {
        this.stations = stations;
    }

    public ArrayList<String> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<String> districts) {
        this.districts = districts;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}
