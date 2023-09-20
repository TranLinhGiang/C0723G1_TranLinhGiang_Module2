package bai_tap_hoc_lai.case_study.repository.impl;

import bai_tap_hoc_lai.case_study.model.facility.Facility;
import bai_tap_hoc_lai.case_study.repository.IFacilityRepository;

import java.util.ArrayList;
import java.util.List;

public class FacilityRepositoryImpl implements IFacilityRepository {
    private final List<Facility> facilities = new ArrayList<>();

    @Override
    public List<Facility> displayMaintenance() {
        return facilities;
    }

    @Override
    public void removeFacility(String name) {
        int index;
        for (Facility valueRemoveFacility : facilities) {
            if (valueRemoveFacility.getName().equals(name)) {
                index = facilities.indexOf(valueRemoveFacility);
                facilities.remove(index);
                break;
            }
        }
    }

    @Override
    public void add(Facility facility) {
        facilities.add(facility);
    }

    @Override
    public List<Facility> getList() {
        return facilities;
    }
}
