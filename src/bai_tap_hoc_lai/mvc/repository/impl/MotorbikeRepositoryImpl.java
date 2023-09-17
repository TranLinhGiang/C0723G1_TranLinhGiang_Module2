package bai_tap_hoc_lai.mvc.repository.impl;

import bai_tap_hoc_lai.mvc.model.Motorbike;
import bai_tap_hoc_lai.mvc.repository.IMotorbikeRepository;
import bai_tap_hoc_lai.mvc.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepositoryImpl implements IMotorbikeRepository {
    private final String PATH_FILE_MOTO = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\mvc\\data\\motorbike.csv";
    private final String COMMA = ",";


    @Override
    public void add(Motorbike motorbike) {
        List<Motorbike> motorbikes = convertToE(FileUtils.readFile(PATH_FILE_MOTO));
        motorbikes.add(motorbike);
        FileUtils.writeFile(PATH_FILE_MOTO,convertToString(motorbikes));
    }

    @Override
    public void removeMotorbike(String licensePlates) {
        List<Motorbike> motorbikes = convertToE(FileUtils.readFile(PATH_FILE_MOTO));
        int index;
        for (Motorbike valueRemove : motorbikes) {
            if (valueRemove.getLicensePlates().equals(licensePlates)) {
                index = motorbikes.indexOf(valueRemove);
                motorbikes.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE_MOTO,convertToString(motorbikes));
    }

    @Override
    public List<Motorbike> getList() {
        return convertToE(FileUtils.readFile(PATH_FILE_MOTO));
    }

    @Override
    public Motorbike searchMotorbike(String licensePlates) {
        List<Motorbike> motorbikes = convertToE(FileUtils.readFile(PATH_FILE_MOTO));
        for (Motorbike valueSearch : motorbikes) {
            if (valueSearch.getLicensePlates().equals(licensePlates)) {
                return valueSearch;
            }
        }
        FileUtils.writeFile(PATH_FILE_MOTO,convertToString(motorbikes));
        return null;
    }

    public List<String> convertToString(List<Motorbike> e) {
        List<String> strings = new ArrayList<>();
        for (Motorbike moto : e) {
            strings.add(moto.getLicensePlates() + COMMA +
                    moto.getManufacturerName() + COMMA +
                    moto.getYearOfManufacture() + COMMA +
                    moto.getOwner() + COMMA +
                    moto.getWattage() + COMMA);
        }
        return strings;
    }

    public List<Motorbike> convertToE(List<String> strings) {
        List<Motorbike>motorbikeList= new ArrayList<>();
        for (String str : strings) {
            String[] data =str.split(COMMA);
            motorbikeList.add(new Motorbike(data[0],data[1],Integer.parseInt(data[2]),data[3],data[4] ));
        }
        return motorbikeList;
    }
}
