package bai_tap_hoc_lai.mvc.repository;

import bai_tap_hoc_lai.mvc.model.Car;

import java.util.List;

public interface IRepository<E> {
    List<E> getList();
}
