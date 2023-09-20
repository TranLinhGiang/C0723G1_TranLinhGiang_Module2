package bai_tap_hoc_lai.case_study.service;

import bai_tap_hoc_lai.case_study.model.facility.Facility;

import java.util.List;

public interface IFacilityService extends IService<Facility> {
    List<Facility> displayMaintenance();

    void removeFacility(String name);
}
