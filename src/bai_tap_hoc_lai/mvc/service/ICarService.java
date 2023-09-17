package bai_tap_hoc_lai.mvc.service;

import bai_tap_hoc_lai.mvc.model.Car;

public interface ICarService extends IService<Car> {

    void add(Car car);

    void removeCar(String licensePlates);
    Car searchCar(String licensePlates);
}
