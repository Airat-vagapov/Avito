package tech.itpark.manager;

import tech.itpark.model.Flat;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class FlatManager {
    private ArrayList<Flat> items = new ArrayList<>();
    private int nextId = 1;

    public Flat save(Flat item) {
        if (item.getId() == 0) {
            item.setId(nextId);
            nextId++;
            items.add(item);
            return item;
        }
        Flat upd = getById(item.getId());
        upd.setStations(item.getStations());
        upd.setDistricts(item.getDistricts());
        upd.setPrice(item.getPrice());
        upd.setFloor(item.getFloor());
        upd.setRooms(item.getRooms());
        return upd;
    }


    public Flat getById(int id) {
        for (Flat item : items) {
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public Set<Flat> search(ArrayList<String> stations,
                            ArrayList<String> districts,
                            int minPrice,
                            int maxPrice,
                            int minFloor,
                            int maxFloor,
                            int rooms) {
        ArrayList<Flat> result = new ArrayList<>();

        for (Flat item : items) {

            if (!containsStations(item, stations)) {
                continue;
            }

            if (!containsDistricts(item, districts)) {
                continue;
            }

            if (item.getPrice() <= minPrice && item.getPrice() >= maxPrice) {
                continue;
            }

            if (item.getFloor() <= minFloor && item.getFloor() >= maxFloor) {
                continue;
            }

            if (item.getRooms() != rooms) {
                continue;
            }
            result.add(item);
        }

        Set<Flat> resultNoDoubles = new LinkedHashSet<Flat>(result);
        return resultNoDoubles;
    }

    // ?? Ощущение, что логика отрабатывает так, что любое совпадение по условиям в любом случае добавляет элемент в поисковую выдачу. Как быть в этом случае? Делить каждую проверку на отдельный метод?


    private boolean containsStations(Flat item, ArrayList<String> stations) {
        for (String station : item.getStations()) {
            if (stations.contains(station)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsDistricts(Flat item, ArrayList<String> districts) {
        for (String district : item.getDistricts()) {
            if (districts.contains(district)) {
                return true;
            }
        }
        return false;
    }
}
