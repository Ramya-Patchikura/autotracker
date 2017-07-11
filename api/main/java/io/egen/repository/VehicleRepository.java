package io.egen.repository;
import io.egen.entity.Readings;
import io.egen.entity.Tires;
import io.egen.entity.Vehicles;


public interface VehicleRepository
{
    Vehicles findVin(String vin);
    void insertVehicles(Vehicles vehicles);
    Vehicles updateVehicles(Vehicles vehicles);
    void ingestReadings(Readings readings);
    void insertTires(Tires tires);
}
