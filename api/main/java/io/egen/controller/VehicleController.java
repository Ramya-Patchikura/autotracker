package io.egen.controller;

import io.egen.entity.Readings;
import io.egen.entity.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import io.egen.service.VehicleService;

import java.util.List;

@RestController
@CrossOrigin
public class VehicleController
{
    @Autowired
    VehicleService vehicleService;


    public VehicleController()
    {
        System.out.println("Entering Vehicle Controller");
    }

    @RequestMapping(method = RequestMethod.PUT, value = "Vehicles",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void update(@RequestBody List<Vehicles> vehicle) {
        System.out.println("Controller !!");
         vehicleService.loadVehicles(vehicle);
    }

    @RequestMapping(method = RequestMethod.POST, value = "Readings",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void ingestReadings(@RequestBody List<Readings> readings) {
        System.out.println("Controller !!");
        vehicleService.ingestReadings(readings);


    }
}
