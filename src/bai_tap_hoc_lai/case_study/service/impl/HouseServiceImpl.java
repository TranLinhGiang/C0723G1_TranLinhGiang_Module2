package bai_tap_hoc_lai.case_study.service.impl;

import bai_tap_hoc_lai.case_study.model.facility.House;
import bai_tap_hoc_lai.case_study.repository.impl.HouseRepositoryImpl;
import bai_tap_hoc_lai.case_study.service.IHouseService;

public class HouseServiceImpl implements IHouseService {
    private final HouseRepositoryImpl houseRepository = new HouseRepositoryImpl();

    @Override
    public void addHouse(House house) {
        houseRepository.addHouse(house);
    }
}
