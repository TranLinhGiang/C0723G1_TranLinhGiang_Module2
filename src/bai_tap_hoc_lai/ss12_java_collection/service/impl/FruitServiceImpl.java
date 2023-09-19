package bai_tap_hoc_lai.ss12_java_collection.service.impl;

import bai_tap_hoc_lai.ss12_java_collection.model.Fruit;
import bai_tap_hoc_lai.ss12_java_collection.repository.impl.FruitRepositoryImpl;
import bai_tap_hoc_lai.ss12_java_collection.service.IFruitService;

import java.util.HashMap;


public class FruitServiceImpl implements IFruitService {
    private final FruitRepositoryImpl fruitRepository = new FruitRepositoryImpl();

    @Override
    public void add(Fruit fruit) {
        fruitRepository.add(fruit);
    }

    @Override
    public void removeFruit(Integer id) {
        fruitRepository.removeFruit(id);
    }

    @Override
    public void editFruit(Integer id,Fruit fruit) {
        fruitRepository.editFruit(id,fruit);
    }

    @Override
    public HashMap<Integer, Fruit> getList() {
        return fruitRepository.getList();
    }

}
