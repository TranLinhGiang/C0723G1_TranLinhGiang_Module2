package bai_tap_hoc_lai.ss16_io_text_file.service;

import java.util.List;

public interface IService<E> {
    void add(E e);

    List<E> getList();
}
