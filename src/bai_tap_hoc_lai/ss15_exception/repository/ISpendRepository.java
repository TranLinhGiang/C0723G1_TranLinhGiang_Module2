package bai_tap_hoc_lai.ss15_exception.repository;

import bai_tap_hoc_lai.ss15_exception.model.Spend;

import java.util.List;

public interface ISpendRepository extends IRepo<Spend> {


    Spend removeSpend(int id);

    void editSpend(int id, Spend spend);

    Spend searchIdSpend(int id);

    List<Spend> searchNameSpend(String name);
}
