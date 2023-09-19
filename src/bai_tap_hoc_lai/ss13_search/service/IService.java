package bai_tap_hoc_lai.ss13_search.service;

import java.util.List;

public interface IService<E> {
    List<E> getSpending();

    void addSpending(E e);

}
