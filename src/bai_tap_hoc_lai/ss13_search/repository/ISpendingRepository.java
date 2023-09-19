package bai_tap_hoc_lai.ss13_search.repository;

import bai_tap_hoc_lai.ss13_search.model.Spending;

public interface ISpendingRepository extends IRepository<Spending> {
    void removeSpending(String id);

    void editSpending(String id, Spending spending);

    Spending searchId(String id);

    Spending searchName(String name);
}
