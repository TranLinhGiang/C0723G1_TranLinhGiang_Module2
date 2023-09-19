package bai_tap_hoc_lai.ss12_java_collection.repository.impl;

import bai_tap_hoc_lai.ss12_java_collection.model.Fruit;
import bai_tap_hoc_lai.ss12_java_collection.repository.IFruitRepository;

import java.util.HashMap;
import java.util.Map;


public class FruitRepositoryImpl implements IFruitRepository {
    private final HashMap<Integer, Fruit> fruitHashMap = new HashMap<>();
    private int count;

    @Override

    public void add(Fruit fruit) {
        count++;
        fruitHashMap.put(count, fruit);
    }

    @Override
    public void removeFruit(Integer id) {
        for (Map.Entry<Integer, Fruit> valueRemove : fruitHashMap.entrySet()) {
            if (id.equals(valueRemove.getValue().getId())) {
                fruitHashMap.remove(valueRemove.getKey());
                break;
            }
        }
    }

    @Override
    public void editFruit(Integer id, Fruit fruit) {
        int index;
        for (Map.Entry<Integer, Fruit> valueRemove : fruitHashMap.entrySet()) {
            if (id.equals(valueRemove.getValue().getId())) {
                fruitHashMap.put(id,fruit);
                break;
            }
        }
    }


    @Override
    public HashMap<Integer, Fruit> getList() {
        return fruitHashMap;
    }
}
