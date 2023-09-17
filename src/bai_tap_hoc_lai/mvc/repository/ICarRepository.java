package bai_tap_hoc_lai.mvc.repository;

import bai_tap_hoc_lai.mvc.model.Car;


public interface ICarRepository extends IRepository<Car> {
    void add(Car car);

    void remove(String licensePlates);
    Car searchCar(String licensePlates);
}
