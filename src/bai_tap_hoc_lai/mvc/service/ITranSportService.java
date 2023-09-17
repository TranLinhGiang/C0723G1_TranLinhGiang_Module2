package bai_tap_hoc_lai.mvc.service;

import bai_tap_hoc_lai.mvc.model.TranSport;

import java.util.List;

public interface ITranSportService extends IService<TranSport>{

    void remove(String licensePlates);

    void add(TranSport tranSport);
}
