package bai_tap_hoc_lai.ss14_sort.repository;

import java.util.List;

public interface IRepo<E> {
    void add(E e);

    List<E> getList();
}
