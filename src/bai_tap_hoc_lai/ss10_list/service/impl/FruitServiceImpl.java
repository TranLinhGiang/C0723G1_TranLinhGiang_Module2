package bai_tap_hoc_lai.ss10_list.service.impl;

import bai_tap_hoc_lai.ss10_list.model.Fruit;
import bai_tap_hoc_lai.ss10_list.repository.impl.FruitRepositoryImpl;
import bai_tap_hoc_lai.ss10_list.service.IFruitService;

import java.util.List;

public class FruitServiceImpl implements IFruitService {
    private final FruitRepositoryImpl fruitRepository = new FruitRepositoryImpl();

    @Override
    public void addFruit(Fruit fruit) {
        fruitRepository.addFruit(fruit);
    }

    @Override
    public void removeFruit(String name) {
        fruitRepository.removeFruit(name);
    }

    @Override
    public void editFruit(String name, Fruit fruit) {
        fruitRepository.editFruit(name, fruit);
    }

    @Override
    public Fruit searchFruit(String name) {
        return fruitRepository.searchFruit(name);
    }

    @Override
    public List<Fruit> getFruit() {
        return fruitRepository.getFruit();
    }
}
