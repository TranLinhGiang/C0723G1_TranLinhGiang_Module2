package bai_tap_hoc_lai.mvc.service;

import bai_tap_hoc_lai.mvc.model.Motorbike;

public interface IMotorbikeService extends IService<Motorbike>{
    void add(Motorbike motorbike);

    void removeMotorbike(String licensePlates);

    Motorbike searchMotorbike(String licensePlates);
}
