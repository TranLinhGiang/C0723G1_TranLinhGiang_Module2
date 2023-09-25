package bai_tap_hoc_lai.ss17_binary_file.service.impl;

import bai_tap_hoc_lai.ss17_binary_file.model.Spending;
import bai_tap_hoc_lai.ss17_binary_file.repository.impl.SpendingRepositoryImpl;
import bai_tap_hoc_lai.ss17_binary_file.service.ISpendingService;

import java.util.List;

public class SpendingServiceImpl implements ISpendingService {
    private final SpendingRepositoryImpl spendingRepository = new SpendingRepositoryImpl();

    @Override
    public List<Spending> getList() {
        return spendingRepository.getList();
    }

    @Override
    public void addSpending(Spending spending) {
        spendingRepository.addSpending(spending);
    }

    @Override
    public void removeSpending(int id) {
        spendingRepository.removeSpending(id);
    }

    @Override
    public void editSpending(int id, Spending spending) {
        spendingRepository.editSpending(id, spending);
    }


    @Override
    public Spending searchIdSpend(int id) {
        return spendingRepository.searchIdSpend(id);
    }

    @Override
    public List<Spending> searchNameSpend(String name) {
        return spendingRepository.searchNameSpend(name);
    }
}
