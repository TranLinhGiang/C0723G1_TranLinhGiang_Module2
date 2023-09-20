package bai_tap_hoc_lai.case_study.service.impl;

import bai_tap_hoc_lai.case_study.model.facility.Facility;
import bai_tap_hoc_lai.case_study.repository.impl.FacilityRepositoryImpl;
import bai_tap_hoc_lai.case_study.service.IFacilityService;

import java.util.List;

public class FacilityServiceImpl implements IFacilityService {
    private final FacilityRepositoryImpl facilityRepository= new FacilityRepositoryImpl();
    @Override
    public List<Facility> displayMaintenance() {
        return facilityRepository.displayMaintenance();
    }

    @Override
    public void removeFacility(String name) {
        facilityRepository.removeFacility(name);
    }

    @Override
    public void add(Facility facility) {
        facilityRepository.add(facility);
    }

    @Override
    public List<Facility> getList() {
        return facilityRepository.getList();
    }
}
