package bai_tap_hoc_lai.ss14_sort.service.impl;

import bai_tap_hoc_lai.ss14_sort.model.Pay;
import bai_tap_hoc_lai.ss14_sort.repository.impl.PayRepositoryImpl;
import bai_tap_hoc_lai.ss14_sort.service.IPayService;

import java.util.List;

public class PayServiceImpl implements IPayService {
    private final PayRepositoryImpl payRepository = new PayRepositoryImpl();

    @Override
    public void removePay(int id) {
        payRepository.removePay(id);
    }

    @Override
    public void edit(int id, Pay pay) {
        payRepository.edit(id,pay);
    }

    @Override
    public Pay searchId(int id) {
        return payRepository.searchId(id);
    }

    @Override
    public Pay searchName(String name) {
        return payRepository.searchName(name);
    }

    @Override
    public void add(Pay pay) {
        payRepository.add(pay);
    }

    @Override
    public List<Pay> getList() {
        return payRepository.getList();
    }

}
