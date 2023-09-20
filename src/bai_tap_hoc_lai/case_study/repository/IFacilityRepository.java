package bai_tap_hoc_lai.case_study.repository;

import bai_tap_hoc_lai.case_study.model.facility.Facility;

import java.util.List;

public interface IFacilityRepository extends IRepo<Facility> {

    List<Facility> displayMaintenance();

    void removeFacility(String name);
}
