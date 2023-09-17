package bai_tap_hoc_lai.mvc.service.impl;

import bai_tap_hoc_lai.mvc.model.Car;
import bai_tap_hoc_lai.mvc.repository.impl.CarRepositoryImpl;
import bai_tap_hoc_lai.mvc.service.ICarService;

import java.util.List;

public class CarServiceImpl implements ICarService {
    private final CarRepositoryImpl carRepository = new CarRepositoryImpl();

    @Override
    public void add(Car car) {
        carRepository.add(car);
    }

    @Override
    public void removeCar(String licensePlates) {
    carRepository.remove(licensePlates);
    }

    @Override
    public Car searchCar(String licensePlates) {
        return carRepository.searchCar(licensePlates);
    }


    @Override
    public List<Car> getList() {
        return carRepository.getList();
    }


}
