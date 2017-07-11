package io.egen.service;

import io.egen.entity.Readings;
import io.egen.entity.Vehicles;
import java.util.List;

public interface VehicleService {

    void loadVehicles (List<Vehicles> vehicles);
    void ingestReadings(List<Readings> readings);

    }


