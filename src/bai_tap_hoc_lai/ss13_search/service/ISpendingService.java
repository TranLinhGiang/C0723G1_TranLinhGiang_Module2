package bai_tap_hoc_lai.ss13_search.service;

import bai_tap_hoc_lai.ss13_search.model.Spending;

public interface ISpendingService extends IService<Spending> {
    void removeSpending(String id);

    void editSpending(String id, Spending spending);

    Spending searchId(String id);

    Spending searchName(String name);
}
