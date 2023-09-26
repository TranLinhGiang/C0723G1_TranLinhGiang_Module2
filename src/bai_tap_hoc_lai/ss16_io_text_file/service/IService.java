package bai_tap_hoc_lai.ss16_io_text_file.service;

import java.io.IOException;
import java.util.List;

public interface IService<E> {
    void add(E e) throws IOException;

    List<E> getList() throws IOException;
}
