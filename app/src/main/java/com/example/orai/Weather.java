package com.example.orai;

public class Weather {
    private int id;
    private String countryName;
    private String degrees;

    public Weather(int id, String countryName, String degrees) {
        this.id = id;
        this.countryName = countryName;
        this.degrees = degrees;
    }

    public Weather() {
    }

    public Weather(String countryName, String degrees) {
        this.countryName = countryName;
        this.degrees = degrees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getDegrees() {
        return degrees;
    }

    public void setDegrees(String degrees) {
        this.degrees = degrees;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", degrees='" + degrees + '\'' +
                '}';
    }
}
