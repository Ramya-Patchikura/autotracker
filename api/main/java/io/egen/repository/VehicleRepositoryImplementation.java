package io.egen.repository;


import io.egen.entity.Readings;
import io.egen.entity.Tires;
import io.egen.entity.Vehicles;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class VehicleRepositoryImplementation implements VehicleRepository {
    @PersistenceContext
    private EntityManager entityManager;


    public Vehicles findVin(String vin)
    {
        return entityManager.find(Vehicles.class, vin);
    }

   @Transactional
    public Vehicles updateVehicles(Vehicles vehicles) {

        return entityManager.merge(vehicles);
    }
  @Transactional
    public void insertVehicles(Vehicles vehicles) {
         entityManager.persist(vehicles);

    }

    @Transactional
    public void ingestReadings(Readings readings)
    {
        entityManager.persist(readings);
    }

    @Transactional
    public void insertTires(Tires tires)
    {
        entityManager.persist(tires);
    }

}

