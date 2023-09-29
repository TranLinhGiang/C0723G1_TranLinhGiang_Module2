package bai_tap_hoc_lai.case_study.repository.impl;

import bai_tap_hoc_lai.case_study.model.facility.Villa;
import bai_tap_hoc_lai.case_study.repository.IVillaRepository;
import bai_tap_hoc_lai.case_study.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class VillaRepositoryImpl implements IVillaRepository {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\case_study\\data\\facility.csv";
    private final String COMMA = ",";

    @Override
    public void addVilla(Villa villa) {
        List<Villa> villaList = convertToE(FileUtils.readFile(PATH_FILE));
        villaList.add(villa);
        FileUtils.writeFile(PATH_FILE, covertToString(villaList));
    }

    public List<String> covertToString(List<Villa> e) {
        List<String> strings = new ArrayList<>();
        for (Villa villa : e) {
            strings.add(villa.getServiceCode() + COMMA +
                    villa.getServiceName() + COMMA +
                    villa.getUsableArea() + COMMA +
                    villa.getRentalCosts() + COMMA +
                    villa.getMaxNumberPeople() + COMMA +
                    villa.getRentalType() + COMMA +
                    villa.getRoomStandard() + COMMA +
                    villa.getPoolArea() + COMMA +
                    villa.getNumberOfFloors());
        }
        return strings;
    }

    public List<Villa> convertToE(List<String> strings) {
        List<Villa> villas = new ArrayList<>();
        for (String str : strings) {
            String[] data = str.split(COMMA);
            villas.add(new Villa(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5], data[6], Integer.parseInt(data[7]), Integer.parseInt(data[8])));
        }
        return villas;
    }
}
