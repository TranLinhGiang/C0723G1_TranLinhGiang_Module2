package bai_tap_hoc_lai.mvc.repository.impl;

import bai_tap_hoc_lai.mvc.model.Truck;
import bai_tap_hoc_lai.mvc.repository.ITruckRepository;
import bai_tap_hoc_lai.mvc.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class TruckRepositoryImpl implements ITruckRepository {
    private final String PATH_FILE_TRUCK = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\mvc\\data\\truck.csv";
    private final String COMMA = ",";


    public void add(Truck car) {
        List<Truck> trucks = convertToE(FileUtils.readFile(PATH_FILE_TRUCK));
        trucks.add(car);
        FileUtils.writeFile(PATH_FILE_TRUCK, convertToString(trucks));
    }

    @Override
    public List<Truck> getList() {
        return convertToE(FileUtils.readFile(PATH_FILE_TRUCK));
    }

    @Override
    public void removeTruck(String licensePlates) {
        List<Truck> trucks = convertToE(FileUtils.readFile(PATH_FILE_TRUCK));
        int index;
        for (Truck valueRemove : trucks) {
            if (valueRemove.getLicensePlates().equals(licensePlates)) {
                index = trucks.indexOf(valueRemove);
                trucks.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE_TRUCK, convertToString(trucks));

    }

    @Override
    public Truck searchTruck(String licensePlates) {
        List<Truck> trucks = convertToE(FileUtils.readFile(PATH_FILE_TRUCK));
        for (Truck valueSearch : trucks) {
            if (valueSearch.getLicensePlates().equals(licensePlates)) {
                return valueSearch;
            }
        }
        FileUtils.writeFile(PATH_FILE_TRUCK, convertToString(trucks));
        return null;
    }

    public List<String> convertToString(List<Truck> e) {
        List<String> stringList = new ArrayList<>();
        for (Truck truckList : e) {
            stringList.add(truckList.getLicensePlates() + COMMA +
                    truckList.getManufacturerName() + COMMA +
                    truckList.getYearOfManufacture() + COMMA +
                    truckList.getOwner() + COMMA +
                    truckList.getPayload());
        }
        return stringList;
    }

    public List<Truck> convertToE(List<String> strings) {
        List<Truck> truckList = new ArrayList<>();
        for (String stringList : strings) {
            String[] data = stringList.split(COMMA);
            truckList.add(new Truck(data[0], data[1], Integer.parseInt(data[2]), data[3], Integer.parseInt(data[4])));
        }
        return truckList;
    }
}
