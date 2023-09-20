package bai_tap_hoc_lai.case_study.service;

import java.util.List;

public interface IService<E> {
    void add(E e);

    List<E> getList();

}
