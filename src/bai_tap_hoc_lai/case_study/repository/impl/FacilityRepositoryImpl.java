//package bai_tap_hoc_lai.case_study.repository.impl;
//
//import bai_tap_hoc_lai.case_study.model.facility.Facility;
//import bai_tap_hoc_lai.case_study.model.facility.Villa;
//import bai_tap_hoc_lai.case_study.repository.IFacilityRepository;
//import bai_tap_hoc_lai.ss12_java_collection.model.Fruit;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class FacilityRepositoryImpl implements IFacilityRepository {
//    private static final Map<Facility, Integer> facilityLinkedHashMap = new LinkedHashMap<>();
//
//    static {
//        Villa villa = new Villa("SVVL01","jfgh",8,6,7,"jhfg","hgf",8,8);
//        facilityLinkedHashMap.put(villa,5);
//    }
//
//    private int count;
//
//    @Override
//    public Map<Facility, Integer> getList() {
//        Map<Facility,Integer> facilityList = facilityLinkedHashMap;
//        return facilityList;
//    }
//
//    @Override
//    public void addFacility(Facility facility) {
//        count++;
//        facilityLinkedHashMap.put(facility, count);
//    }
//
//    @Override
//    public LinkedHashMap<Facility, Integer> getMaintenanceList() {
//        return  null;
//    }
//
//    @Override
//    public void removeFacility(String serviceCode) {
////        for (Map.Entry<Integer, Fruit> valueRemove : fruitHashMap.entrySet()) {
////            if (id.equals(valueRemove.getValue().getId())) {
////                fruitHashMap.remove(valueRemove.getKey());
////                break;
////            }
////        }
//        for (Map.Entry<Facility, Integer> valueRemove : facilityLinkedHashMap.entrySet()) {
//            if (valueRemove.getKey().getServiceCode().equals(serviceCode)) {
//                facilityLinkedHashMap.remove(valueRemove.getKey());
//            }
//        }
//    }
//}
