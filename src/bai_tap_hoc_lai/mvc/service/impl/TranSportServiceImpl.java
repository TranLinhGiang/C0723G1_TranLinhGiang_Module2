package bai_tap_hoc_lai.mvc.service.impl;

import bai_tap_hoc_lai.mvc.model.Car;
import bai_tap_hoc_lai.mvc.model.TranSport;
import bai_tap_hoc_lai.mvc.repository.impl.TranSportRepositoryImpl;
import bai_tap_hoc_lai.mvc.service.ITranSportService;

import java.util.List;

public class TranSportServiceImpl implements ITranSportService {
    private final TranSportRepositoryImpl tranSportRepository= new TranSportRepositoryImpl();
    @Override
    public void remove(String licensePlates) {
        tranSportRepository.remove(licensePlates);
    }

    @Override
    public void add(TranSport tranSport) {
        tranSportRepository.add((Car) tranSport);
    }

    @Override
    public List<TranSport> getList() {
        return tranSportRepository.getList();
    }
}
