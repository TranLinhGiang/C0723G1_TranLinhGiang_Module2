package bai_tap_hoc_lai.case_study.repository.impl;

import bai_tap_hoc_lai.case_study.model.facility.House;
import bai_tap_hoc_lai.case_study.repository.IHouseRepository;
import bai_tap_hoc_lai.case_study.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class HouseRepositoryImpl implements IHouseRepository {
    public static final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\case_study\\data\\facility.csv";
    public static final String COMMA = ",";

    @Override
    public void addHouse(House house) {
        List<House> houseList = convertToE(FileUtils.readFile(PATH_FILE));
        houseList.add(house);
        FileUtils.writeFile(PATH_FILE, covertToString(houseList));
    }

    public List<String> covertToString(List<House> e) {
        List<String> strings = new ArrayList<>();
        for (House house : e) {
            strings.add(house.getServiceCode() + COMMA +
                    house.getServiceName() + COMMA +
                    house.getUsableArea() + COMMA +
                    house.getRentalCosts() + COMMA +
                    house.getMaxNumberPeople() + COMMA +
                    house.getRentalType() + COMMA +
                    house.getRoomStandard() + COMMA +
                    house.getNumberOfFloors());
        }
        return strings;
    }

    public List<House> convertToE(List<String> strings) {
        List<House> houses = new ArrayList<>();
        for (String str : strings) {
            String[] data = str.split(COMMA);
            houses.add(new House(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5], data[6], Integer.parseInt(data[7])));

        }
        return houses;
    }
}
