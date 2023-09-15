package bai_tap_hoc_lai.ss10_list.repository.impl;

import bai_tap_hoc_lai.ss10_list.model.Fruit;
import bai_tap_hoc_lai.ss10_list.repository.IFruitRepository;
import bai_tap_hoc_lai.ss10_list.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class FruitRepositoryImpl implements IFruitRepository {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\ss10_list\\data\\fruit.csv";
    private final String COMMA = ",";


    @Override
    public void addFruit(Fruit fruit) {
        List<Fruit> fruits = convertToE(FileUtils.readFile(PATH_FILE));

        fruits.add(fruit);
        FileUtils.writeFile(PATH_FILE, convertToString(fruits));
    }

    @Override
    public void removeFruit(String name) {
        List<Fruit> fruits = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Fruit valueRemove : fruits) {
            if (valueRemove.getName().equals(name)) {
                index = fruits.indexOf(valueRemove);
                fruits.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(fruits));

    }

    @Override
    public void editFruit(String name, Fruit fruit) {
        List<Fruit> fruits = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Fruit valueEdit : fruits) {
            if (valueEdit.getName().equals(name)) {
                index = fruits.indexOf(valueEdit);
                fruits.set(index, fruit);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(fruits));

    }

    @Override
    public Fruit searchFruit(String name) {
        List<Fruit> fruits = convertToE(FileUtils.readFile(PATH_FILE));
        for (Fruit valueSearch : fruits) {
            if (valueSearch.getName().equals(name)) {
                return valueSearch;
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(fruits));
        return null;
    }

    @Override
    public List<Fruit> getFruit() {
        return convertToE(FileUtils.readFile(PATH_FILE));
    }

    public List<String> convertToString(List<Fruit> e) {
        List<String> strings = new ArrayList<>();
        for (Fruit fruit : e) {
            strings.add(fruit.getName() + COMMA +
                    fruit.getTypeFruit() + COMMA +
                    fruit.getDateOfManufacture() + COMMA +
                    fruit.getExpiry() + COMMA +
                    fruit.getOrigin() + COMMA +
                    fruit.getPrice());
        }
        return strings;
    }

    public List<Fruit> convertToE(List<String> strings) {
        List<Fruit> fruitList = new ArrayList<>();
        for (String str : strings) {
            String[] data = str.split(COMMA);
            fruitList.add(new Fruit(data[0], data[1], data[2], data[3], data[4], Double.parseDouble(data[5])));
        }

        return fruitList;
    }
}
