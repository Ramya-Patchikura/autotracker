package io.egen.service;

import io.egen.entity.Readings;
import io.egen.entity.Tires;
import io.egen.entity.Vehicles;
import io.egen.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;


    public void loadVehicles(List<Vehicles> v)
    {

        for (int i = 0; i < v.size(); i++) {
            Vehicles v1 = v.get(i);
            String vin = v1.getVin();
            Vehicles r = vehicleRepository.findVin(vin);
            if (r == null) {

                vehicleRepository.insertVehicles(v1);   //insert vin
            } else {
                vehicleRepository.updateVehicles(v1); //update vin
            }
        }
    }

    public void ingestReadings(List<Readings> r) {
        for (int i = 0; i < r.size(); i++) {
            Readings r1 = r.get(i);
            Tires t = r1.getTires();
            vehicleRepository.insertTires(t);//insert tires
            vehicleRepository.ingestReadings(r1);//insert the first readings object

        }
    }


}


