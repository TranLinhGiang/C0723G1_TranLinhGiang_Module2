package bai_tap_hoc_lai.case_study.service.impl;

import bai_tap_hoc_lai.case_study.model.facility.Villa;
import bai_tap_hoc_lai.case_study.repository.impl.VillaRepositoryImpl;
import bai_tap_hoc_lai.case_study.service.IVillaService;

public class VillaServiceImpl implements IVillaService {
    private final VillaRepositoryImpl villaRepository = new VillaRepositoryImpl();

    @Override
    public void addVilla(Villa villa) {
        villaRepository.addVilla(villa);
    }
}
