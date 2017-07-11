package io.egen.entity;


import javax.persistence.*;

@Entity

    public class Vehicles {
    @Id             //PK
    @Column(columnDefinition = "VARCHAR(17)")
    private String vin;

    private String make;
    private String model;
    private int year;
    private int redlineRPM;
    private int maxFuelVolume;


    @Column(columnDefinition = "VARCHAR(24)")
    private String lastServiceDate;

    //getters setters
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRedlineRPM() {
        return redlineRPM;
    }

    public void setRedlineRPM(int redlineRPM) {
        this.redlineRPM = redlineRPM;
    }

    public int getMaxFuelVolume() {
        return maxFuelVolume;
    }

    public void setMaxFuelVolume(int maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public String getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin='" + vin + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", redlineRPM=" + redlineRPM +
                ", maxFuelVolume=" + maxFuelVolume +
                ", lastServiceDate='" + lastServiceDate + '\'' +
                '}';


    }
}

