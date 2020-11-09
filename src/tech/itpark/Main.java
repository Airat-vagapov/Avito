package tech.itpark;

import tech.itpark.manager.FlatManager;
import tech.itpark.model.Flat;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FlatManager manager = new FlatManager();

        ArrayList<String> stations = new ArrayList<>();
        stations.add("Пушкинская");
        stations.add("Тверская");
        stations.add("Чеховская");
        stations.add("Киевская");

        ArrayList<String> districts = new ArrayList<>();
        districts.add("Центральный");
        districts.add("Московский");
        districts.add("Советский");

        ArrayList<String> flatStationOne = new ArrayList<>();
        flatStationOne.add("Тверская");

        ArrayList<String> flatStationTwo = new ArrayList<>();
        flatStationTwo.add("тестовая");

        Flat one = manager.save(new Flat(
                0,
                stations,
                districts,
                1400,
                4,
                2));

        Flat two = manager.save(new Flat(
                0,
                stations,
                districts,
                2200,
                5,
                2));

        manager.search(stations, districts, 1200, 1800, 2,9,2);

    }
}
