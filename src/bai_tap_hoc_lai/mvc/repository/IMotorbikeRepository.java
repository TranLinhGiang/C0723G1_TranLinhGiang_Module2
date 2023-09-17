package bai_tap_hoc_lai.mvc.repository;

import bai_tap_hoc_lai.mvc.model.Motorbike;

public interface IMotorbikeRepository extends IRepository<Motorbike> {
    void add(Motorbike motorbike);

    void removeMotorbike(String licensePlates);

    Motorbike searchMotorbike(String licensePlates);
}
