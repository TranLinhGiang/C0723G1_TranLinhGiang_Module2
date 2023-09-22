package bai_tap_hoc_lai.ss15_exception.service.impl;

import bai_tap_hoc_lai.ss15_exception.model.Spend;
import bai_tap_hoc_lai.ss15_exception.repository.impl.SpendRepositoryImpl;
import bai_tap_hoc_lai.ss15_exception.service.ISpendService;

import java.util.List;

public class SpendServiceImpl implements ISpendService {
    private final SpendRepositoryImpl spendRepository = new SpendRepositoryImpl();

    @Override
    public void add(Spend spend) {
        spendRepository.add(spend);
    }

    @Override
    public List<Spend> getList() {
        return spendRepository.getList();
    }

    @Override
    public void removeSpend(int id) {
        spendRepository.removeSpend(id);
    }

    @Override
    public void editSpend(int id, Spend spend) {
        spendRepository.editSpend(id, spend);
    }

    @Override
    public Spend searchIdSpend(int id) {
        return spendRepository.searchIdSpend(id);
    }

    @Override
    public List<Spend> searchNameSpend(String name) {
       return spendRepository.searchNameSpend(name);
    }
}
