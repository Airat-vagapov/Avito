package tech.itpark.manager;

import tech.itpark.model.Flat;

import java.util.ArrayList;

public class FlatManager {
    private ArrayList<Flat> flats = new ArrayList<>();
    private int nextId = 1;

    public Flat save(Flat flat){
        if (flat.getId() == 0){
            flat.setId(nextId);
            nextId++;
            flats.add(flat);
        }
        return flat;
    }

    public ArrayList<Flat> search(ArrayList<String> stations,
                                  ArrayList<String> districts,
                                  int minPrice,
                                  int maxPrice,
                                  int minFloor,
                                  int maxFloor,
                                  int rooms) {
        ArrayList<Flat> result = new ArrayList<>();

        for (Flat flat : flats) {
            if (containsStations(flat, stations)) {
                result.add(flat);
            }
        }

        for (Flat flat : flats) {
            if (containsDistricts(flat, districts)){
                result.add(flat);
            }
        }

        for (Flat flat : flats) {
            if (flat.getPrice() >= minPrice && flat.getPrice() <= maxPrice) {
                result.add(flat);
            }
        }

        for (Flat flat : flats) {
            if (flat.getFloor() <= minFloor && flat.getFloor() <= maxFloor) {
                result.add(flat);
            }
        }

        for (Flat flat : flats) {
            if (flat.getRooms() == rooms) {
                result.add(flat);
            }
        }

        return result;
    }



    private boolean containsStations(Flat flat, ArrayList<String> stations) {
        for (String station: flat.getStations()) {
            if (stations.contains(station)){

                return true;
            }
        }
        return false;
    }

    private boolean containsDistricts(Flat flat, ArrayList<String> districts) {
        for (String district : flat.getDistricts()) {
            if (districts.contains(district)){
                return true;
            }
        }
        return false;
    }





}
