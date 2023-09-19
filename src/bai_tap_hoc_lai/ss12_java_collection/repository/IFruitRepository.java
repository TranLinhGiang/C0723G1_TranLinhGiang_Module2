package bai_tap_hoc_lai.ss12_java_collection.repository;

import bai_tap_hoc_lai.ss12_java_collection.model.Fruit;

public interface IFruitRepository extends IRepo<Fruit> {

    void removeFruit(Integer id);

    void editFruit(Integer id,Fruit fruit);
}
