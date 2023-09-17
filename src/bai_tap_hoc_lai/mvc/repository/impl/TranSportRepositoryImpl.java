package bai_tap_hoc_lai.mvc.repository.impl;

import bai_tap_hoc_lai.mvc.model.Car;
import bai_tap_hoc_lai.mvc.model.TranSport;
import bai_tap_hoc_lai.mvc.repository.ITranSportRepository;

import java.util.ArrayList;
import java.util.List;

public class TranSportRepositoryImpl implements ITranSportRepository {
    List<TranSport> tranSports = new ArrayList<>();

    @Override
    public void add(Car car) {
        tranSports.add(car);
    }

    @Override
    public List<TranSport> getList() {
        return null;
    }

    @Override
    public void remove(String licensePlates) {

    }
}
