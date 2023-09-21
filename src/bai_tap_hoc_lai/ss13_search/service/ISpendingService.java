package bai_tap_hoc_lai.ss13_search.service;

import bai_tap_hoc_lai.ss13_search.model.Spending;

import java.util.List;

public interface ISpendingService extends IService<Spending> {
    void removeSpending(String id);

    void editSpending(String id, Spending spending);

    Spending searchId(String id);

    List<Spending> searchName(String name);
}
