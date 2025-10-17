package com.example.listycity;

/**
 This is a class that defines a city
 */
public class City implements Comparable<City> {
    /**
     * Stores the city
     */
    private String city;
    /**
     * Stores the province
     */
    private String province;
    /**
     * Constructor
     * @param city
     * @param province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * Getter for city
     * @return
     */
    String getCityName(){
        return this.city;
    }
    /**
     * Getter for province
     * @return
     */
    String getProvinceName(){
        return this.province;
    }
    /**
     * Compares two cities
     * @param o
     * @return
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}