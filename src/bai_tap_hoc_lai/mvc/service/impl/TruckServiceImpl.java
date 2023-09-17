package bai_tap_hoc_lai.mvc.service.impl;

import bai_tap_hoc_lai.mvc.model.Car;
import bai_tap_hoc_lai.mvc.model.Truck;
import bai_tap_hoc_lai.mvc.repository.impl.TruckRepositoryImpl;
import bai_tap_hoc_lai.mvc.service.ITruckService;

import java.util.List;

public class TruckServiceImpl implements ITruckService {
    private final TruckRepositoryImpl truckRepository = new TruckRepositoryImpl();

    @Override
    public void add(Truck truck) {
        truckRepository.add(truck);
    }

    @Override
    public void removeTruck(String licensePlates) {
        truckRepository.removeTruck(licensePlates);
    }

    @Override
    public Truck searchTruck(String licensePlates) {
        return truckRepository.searchTruck(licensePlates);
    }

    @Override
    public List<Truck> getList() {
        return truckRepository.getList();
    }


}
