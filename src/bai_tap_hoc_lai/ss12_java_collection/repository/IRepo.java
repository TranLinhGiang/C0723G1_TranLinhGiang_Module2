package bai_tap_hoc_lai.ss12_java_collection.repository;

import java.util.HashMap;

public interface IRepo<E> {
    HashMap<Integer, E> getList();

    void add(E e);
}
