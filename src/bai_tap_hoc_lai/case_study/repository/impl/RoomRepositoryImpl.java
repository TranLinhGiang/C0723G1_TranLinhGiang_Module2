package bai_tap_hoc_lai.case_study.repository.impl;

import bai_tap_hoc_lai.case_study.model.facility.Room;
import bai_tap_hoc_lai.case_study.repository.IRoomRepository;
import bai_tap_hoc_lai.case_study.utils.FileUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoomRepositoryImpl implements IRoomRepository {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\case_study\\data\\facility.csv";
    public static final String COMMA = ",";


    @Override
    public void addRoom(Room room) {
        Map<String, Room> roomList = convertToE(FileUtils.readFile(PATH_FILE));
        roomList.put(room.getServiceCode(), room);
        FileUtils.writeFile(PATH_FILE, convertToString(roomList));
    }

    public List<String> convertToString(Map<String, Room> e) {
        List<String> strings = new ArrayList<>();
        e.forEach((String id, Room room) -> {
            strings.add(room.getServiceCode() + COMMA +
                    room.getServiceName() + COMMA +
                    room.getUsableArea() + COMMA +
                    room.getRentalCosts() + COMMA +
                    room.getMaxNumberPeople() + COMMA +
                    room.getRentalType() + COMMA +
                    room.getFree());
        });
        return strings;
    }

    public Map<String, Room> convertToE(List<String> strings) {
        Map<String, Room> rooms = new LinkedHashMap<>();
        for (String str : strings) {
            if (str.isEmpty()) {
                continue;
            }
            String[] data = str.split(COMMA);
            if (data.length < 7) {
                continue;
            }
            rooms.put(data[0], new Room(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5], data[6]));
        }
        return rooms;
    }
}
