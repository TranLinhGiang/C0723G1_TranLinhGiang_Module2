package bai_tap_hoc_lai.case_study.service.impl;

import bai_tap_hoc_lai.case_study.model.facility.Room;
import bai_tap_hoc_lai.case_study.repository.impl.RoomRepositoryImpl;
import bai_tap_hoc_lai.case_study.service.IRoomService;

public class RoomServiceImpl implements IRoomService {
    private final RoomRepositoryImpl roomRepository = new RoomRepositoryImpl();

    @Override
    public void addRoom(Room room) {
        roomRepository.addRoom(room);
    }
}
