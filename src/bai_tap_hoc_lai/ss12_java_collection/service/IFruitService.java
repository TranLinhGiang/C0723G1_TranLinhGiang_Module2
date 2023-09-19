package bai_tap_hoc_lai.ss12_java_collection.service;

import bai_tap_hoc_lai.ss12_java_collection.model.Fruit;

public interface IFruitService extends IService<Fruit> {
    void removeFruit(Integer id);

    void editFruit(Integer id,Fruit fruit);
}
