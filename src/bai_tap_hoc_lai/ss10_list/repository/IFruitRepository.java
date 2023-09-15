package bai_tap_hoc_lai.ss10_list.repository;

import bai_tap_hoc_lai.ss10_list.model.Fruit;

import java.util.List;

public interface IFruitRepository {
    void addFruit(Fruit fruit);

    void removeFruit(String name);

    void editFruit(String name, Fruit fruit);

    Fruit searchFruit(String name);

    List<Fruit> getFruit();
}
