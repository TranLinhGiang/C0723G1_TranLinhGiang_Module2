package bai_tap_hoc_lai.case_study.repository.impl;

import bai_tap_hoc_lai.case_study.model.facility.Villa;
import bai_tap_hoc_lai.case_study.repository.IVillaRepository;
import bai_tap_hoc_lai.case_study.utils.FileUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class VillaRepositoryImpl implements IVillaRepository {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\case_study\\data\\facility.csv";
    private final String COMMA = ",";

    @Override
    public void addVilla(Villa villa) {
        Map<String, Villa> villaList = convertToE(FileUtils.readFile(PATH_FILE));
        villaList.put(villa.getServiceCode(), villa);
        FileUtils.writeFile(PATH_FILE, covertToString(villaList));
    }

    public List<String> covertToString(Map<String, Villa> e) {
        List<String> strings = new ArrayList<>();
        e.forEach((String id, Villa villa) -> {
            strings.add(villa.getServiceCode() + COMMA +
                    villa.getServiceName() + COMMA +
                    villa.getUsableArea() + COMMA +
                    villa.getRentalCosts() + COMMA +
                    villa.getMaxNumberPeople() + COMMA +
                    villa.getRentalType() + COMMA +
                    villa.getRoomStandard() + COMMA +
                    villa.getPoolArea() + COMMA +
                    villa.getNumberOfFloors());
        });
        return strings;
    }

    public Map<String, Villa> convertToE(List<String> strings) {
        Map<String, Villa> villas = new LinkedHashMap();
        for (String str : strings) {
            if (str.isEmpty()) {
                continue;
            }
            String[] data = str.split(COMMA);
            if (data.length < 9) {
                continue;
            }
            villas.put(data[0], new Villa(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5], data[6], Integer.parseInt(data[7]), Integer.parseInt(data[8])));
        }
        return villas;
    }
}
