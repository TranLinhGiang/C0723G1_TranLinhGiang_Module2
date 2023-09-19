package bai_tap_hoc_lai.ss13_search.repository;

import java.util.List;

public interface IRepository<E> {
    List<E> getSpending();

    void addSpending(E e);
}
