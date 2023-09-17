package bai_tap_hoc_lai.mvc.service;

import bai_tap_hoc_lai.mvc.model.Car;
import bai_tap_hoc_lai.mvc.model.Truck;

public interface ITruckService extends IService<Truck> {
    void add(Truck truck);

    void removeTruck(String licensePlates);

    Truck searchTruck(String licensePlates);
}
