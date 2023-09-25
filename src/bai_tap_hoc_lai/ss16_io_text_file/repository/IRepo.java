package bai_tap_hoc_lai.ss16_io_text_file.repository;

import java.util.List;

public interface IRepo <E>{
    void add(E e);

    List<E> getList();

}
