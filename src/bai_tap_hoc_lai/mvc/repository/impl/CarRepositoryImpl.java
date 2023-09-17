package bai_tap_hoc_lai.mvc.repository.impl;

import bai_tap_hoc_lai.mvc.model.Car;
import bai_tap_hoc_lai.mvc.repository.ICarRepository;
import bai_tap_hoc_lai.mvc.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class CarRepositoryImpl implements ICarRepository {
    public static String PATH_FILE_CAR = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\mvc\\data\\car.csv";
    public static String COMMA = ",";


    @Override
    public void add(Car car) {
        List<Car> cars = convertToE(FileUtils.readFile(PATH_FILE_CAR));
        cars.add(car);
        FileUtils.writeFile(PATH_FILE_CAR,convertToString(cars));
    }

    @Override
    public void remove(String licensePlates) {
        List<Car> cars = convertToE(FileUtils.readFile(PATH_FILE_CAR));
        int index;
        for (Car valueRemove : cars) {
            if (valueRemove.getLicensePlates().equals(licensePlates)) {
                index = cars.indexOf(valueRemove);
                cars.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE_CAR,convertToString(cars));
    }

    @Override
    public Car searchCar(String licensePlates) {
        List<Car> cars = convertToE(FileUtils.readFile(PATH_FILE_CAR));
        for (Car valueSearch : cars) {
            if (valueSearch.getLicensePlates().equals(licensePlates)) {
                return valueSearch;
            }
        }
        FileUtils.writeFile(PATH_FILE_CAR,convertToString(cars));

        return null;
    }


    @Override
    public List<Car> getList() {
        return convertToE(FileUtils.readFile(PATH_FILE_CAR));
    }

    public List<String> convertToString(List<Car> e) {
        List<String> strings = new ArrayList<>();
        for (Car car : e) {
            strings.add(car.getLicensePlates() + COMMA +
                    car.getManufacturerName() + COMMA +
                    car.getYearOfManufacture() + COMMA +
                    car.getOwner() + COMMA +
                    car.getNumberOfSeats() + COMMA +
                    car.getTypeCar());
        }
        return strings;
    }

    public List<Car> convertToE(List<String> strings) {
        List<Car> carList = new ArrayList<>();
        for (String str : strings) {
            String[] data = str.split(COMMA);
            carList.add(new Car(data[0], data[1], Integer.parseInt(data[2]), data[3], Integer.parseInt(data[4]), data[5]));
        }
        return carList;
    }

}
