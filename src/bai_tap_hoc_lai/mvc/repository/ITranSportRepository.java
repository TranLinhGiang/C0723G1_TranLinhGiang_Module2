package bai_tap_hoc_lai.mvc.repository;

import bai_tap_hoc_lai.mvc.model.Car;
import bai_tap_hoc_lai.mvc.model.TranSport;

public interface ITranSportRepository extends IRepository<TranSport> {
    void add(Car car);

    void remove(String licensePlates);

}
