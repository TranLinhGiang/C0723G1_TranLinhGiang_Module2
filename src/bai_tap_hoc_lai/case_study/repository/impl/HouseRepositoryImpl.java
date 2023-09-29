package bai_tap_hoc_lai.case_study.repository.impl;

import bai_tap_hoc_lai.case_study.model.facility.House;
import bai_tap_hoc_lai.case_study.model.facility.Villa;
import bai_tap_hoc_lai.case_study.repository.IHouseRepository;
import bai_tap_hoc_lai.case_study.utils.FileUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HouseRepositoryImpl implements IHouseRepository {
    public static final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\case_study\\data\\facility.csv";
    public static final String COMMA = ",";

    @Override
    public void addHouse(House house) {
        Map<String, House> houseList = convertToE(FileUtils.readFile(PATH_FILE));
        houseList.put(house.getServiceCode(), house);
        FileUtils.writeFile(PATH_FILE, covertToString(houseList));
    }

    public List<String> covertToString(Map<String, House> e) {
        List<String> strings = new ArrayList<>();
        e.forEach((String id, House house) -> {
            strings.add(house.getServiceCode() + COMMA +
                    house.getServiceName() + COMMA +
                    house.getUsableArea() + COMMA +
                    house.getRentalCosts() + COMMA +
                    house.getMaxNumberPeople() + COMMA +
                    house.getRentalType() + COMMA +
                    house.getRoomStandard() + COMMA +
                    house.getNumberOfFloors());
        });
        return strings;
    }

    public Map<String, House> convertToE(List<String> strings) {
        Map<String, House> houses = new LinkedHashMap<>();
        for (String str : strings) {
            if (str.isEmpty()) {
                continue;
            }
            String[] data = str.split(COMMA);
            if (data.length < 8) {
                continue;
            }
            houses.put(data[0], new House(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5], data[6], Integer.parseInt(data[7])));

        }
        return houses;
    }
}
