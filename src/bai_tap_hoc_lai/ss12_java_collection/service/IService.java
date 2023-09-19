package bai_tap_hoc_lai.ss12_java_collection.service;

import java.util.HashMap;

public interface IService<E> {
    HashMap<Integer,E> getList();

    void add(E e);

}
