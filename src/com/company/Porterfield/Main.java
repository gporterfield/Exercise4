package com.company.Porterfield;

import java.util.*;

public class Main {

    static void enterCities(Map<String, String> cities) {
        Scanner input = new Scanner(System.in);
        String city = "w";
        while(!city.equals("END")) {
            System.out.println("Enter the name of a city (END to exit): ");
            city = input.nextLine();
            if(!city.equals("END")) {
                cities.put(city, "");
            }
        }
    }


    static void getTemps(Map<String, String> cities) {
        Scanner input = new Scanner(System.in);
        String key;
        String temp;

        System.out.println("Enter 5 average temps(All in one line separated by spaces)");
        for(Map.Entry<String, String> entry : cities.entrySet()) {
            key = entry.getKey();
            System.out.print(key + ": ");
            temp = input.nextLine();
            cities.put(key, temp);
        }
    }


    static int getAvgTemp(String value) {
        int counter = 0;
        int total = 0;
        String[] array = value.split(" ");
        for(int i=0; i < array.length; i++, counter++) {
            total = total + Integer.parseInt(array[i]);
        }
        return total/counter;
    }


    static void displayResults(Map<String, String> cities) {
        String key;
        String temp;
        for (Map.Entry<String,String> entry : cities.entrySet()) {
            key = entry.getKey();
            temp = entry.getValue();
            System.out.println(key + "'s average temperature is: " + getAvgTemp(temp));

        }

    }


    public static void main(String[] args) {

        Map<String, String> cities = new HashMap<>();

        enterCities(cities);
        getTemps(cities);
        displayResults(cities);
    }
}
