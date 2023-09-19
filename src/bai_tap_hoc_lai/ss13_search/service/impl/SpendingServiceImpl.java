package bai_tap_hoc_lai.ss13_search.service.impl;

import bai_tap_hoc_lai.ss13_search.model.Spending;
import bai_tap_hoc_lai.ss13_search.repository.impl.SpendingRepositoryImpl;
import bai_tap_hoc_lai.ss13_search.service.ISpendingService;

import java.util.List;

public class SpendingServiceImpl implements ISpendingService {
    private final SpendingRepositoryImpl spendingRepository = new SpendingRepositoryImpl();

    @Override
    public List<Spending> getSpending() {
        return spendingRepository.getSpending();
    }

    @Override
    public void addSpending(Spending spending) {
        spendingRepository.addSpending(spending);
    }

    @Override
    public void removeSpending(String id) {
        spendingRepository.removeSpending(id);
    }

    @Override
    public void editSpending(String id, Spending spending) {
        spendingRepository.editSpending(id,spending);
    }

    @Override
    public Spending searchId(String id) {
        return spendingRepository.searchId(id) ;
    }

    @Override
    public Spending searchName(String name) {
        return spendingRepository.searchName(name);
    }
}
