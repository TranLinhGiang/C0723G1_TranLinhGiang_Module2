package bai_tap_hoc_lai.mvc.repository;


import bai_tap_hoc_lai.mvc.model.Truck;

public interface ITruckRepository extends IRepository<Truck> {
    void removeTruck(String licensePlates);
    Truck searchTruck(String licensePlates);
}
