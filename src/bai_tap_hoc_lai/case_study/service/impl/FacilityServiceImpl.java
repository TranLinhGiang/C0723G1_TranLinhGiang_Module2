//package bai_tap_hoc_lai.case_study.service.impl;
//
//import bai_tap_hoc_lai.case_study.model.facility.Facility;
//import bai_tap_hoc_lai.case_study.repository.impl.FacilityRepositoryImpl;
//import bai_tap_hoc_lai.case_study.service.IFacilityService;
//
//import java.util.LinkedHashMap;
//
//public class FacilityServiceImpl implements IFacilityService {
//    private final FacilityRepositoryImpl facilityRepository = new FacilityRepositoryImpl();
//
//
//    @Override
//    public LinkedHashMap<Facility, Integer> getList() {
//        return facilityRepository.getList();
//    }
//
//    @Override
//    public void addFacility(Facility facility) {
//        facilityRepository.addFacility(facility);
//    }
//
//    @Override
//    public LinkedHashMap<Facility, Integer> getMaintenanceList() {
//        return facilityRepository.getMaintenanceList();
//    }
//
//    @Override
//    public void removeFacility(String serviceCode) {
//    facilityRepository.removeFacility(serviceCode);
//    }
//}
