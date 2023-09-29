package bai_tap_hoc_lai.case_study.repository.impl;

import bai_tap_hoc_lai.case_study.model.facility.Room;
import bai_tap_hoc_lai.case_study.repository.IRoomRepository;
import bai_tap_hoc_lai.case_study.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class RoomRepositoryImpl implements IRoomRepository {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\case_study\\data\\facility.csv";
    public static final String COMMA = ",";


    @Override
    public void addRoom(Room room) {
        List<Room> roomList = convertToE(FileUtils.readFile(PATH_FILE));
        roomList.add(room);
        FileUtils.writeFile(PATH_FILE, convertToString(roomList));
    }

    public List<String> convertToString(List<Room> e) {
        List<String> strings = new ArrayList<>();
        for (Room room : e) {
            strings.add(room.getServiceCode() + COMMA +
                    room.getServiceName() + COMMA +
                    room.getUsableArea() + COMMA +
                    room.getRentalCosts() + COMMA +
                    room.getMaxNumberPeople() + COMMA +
                    room.getRentalType() + COMMA +
                    room.getFree());
        }
        return strings;
    }

    public List<Room> convertToE(List<String> strings) {
        List<Room> rooms = new ArrayList<>();
        for (String str : strings) {
            String[] data = str.split(COMMA);
            rooms.add(new Room(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5], data[6]));
        }
        return rooms;
    }
}
