package bai_tap_hoc_lai.mvc.service.impl;


import bai_tap_hoc_lai.mvc.model.Motorbike;
import bai_tap_hoc_lai.mvc.repository.impl.MotorbikeRepositoryImpl;
import bai_tap_hoc_lai.mvc.service.IMotorbikeService;

import java.util.List;

public class MotorbikeServiceImpl implements IMotorbikeService {
    private final MotorbikeRepositoryImpl motorbikeRepository = new MotorbikeRepositoryImpl();

    @Override
    public void add(Motorbike motorbike) {
        motorbikeRepository.add(motorbike);
    }

    @Override
    public void removeMotorbike(String licensePlates) {
        motorbikeRepository.removeMotorbike(licensePlates);
    }

    @Override
    public Motorbike searchMotorbike(String licensePlates) {
        return motorbikeRepository.searchMotorbike(licensePlates);
    }

    @Override
    public List<Motorbike> getList() {
        return motorbikeRepository.getList();
    }
}
