package bai_tap_hoc_lai.ss17_binary_file.service;

import bai_tap_hoc_lai.ss17_binary_file.model.Spending;

import java.util.List;

public interface ISpendingService {
    List<Spending> getList();

    void addSpending(Spending spending);

    void removeSpending(int id);

    void editSpending(int id, Spending spending);

    Spending searchIdSpend(int id);

    List<Spending> searchNameSpend(String name);

}
