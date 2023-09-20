package bai_tap_hoc_lai.ss13_search.repository.impl;

import bai_tap_hoc_lai.ss13_search.model.Spending;
import bai_tap_hoc_lai.ss13_search.repository.ISpendingRepository;
import bai_tap_hoc_lai.ss13_search.utils.FileUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;

public class SpendingRepositoryImpl implements ISpendingRepository {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\ss13_search\\data\\spending.csv";
    private final String COMMA = ",";


    @Override

    public List<Spending> getSpending() {
        List<Spending> spendings = convertToE(FileUtils.readFile(PATH_FILE));
        spendings.sort(new Comparator<Spending>() {
            @Override
            public int compare(Spending o1, Spending o2) {
                return Integer.parseInt(o1.getId()) - Integer.parseInt(o2.getId());
            }
        });
        FileUtils.writeFile(PATH_FILE,convertToString(spendings));
        return spendings;
    }

    @Override
    public void addSpending(Spending spending) {
        List<Spending> spendings = convertToE(FileUtils.readFile(PATH_FILE));
        spendings.add(spending);
        FileUtils.writeFile(PATH_FILE,convertToString(spendings));
    }

    @Override
    public void removeSpending(String id) {
        List<Spending> spendings = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Spending valueRemove : spendings) {
            if (valueRemove.getId().equals(id)) {
                index = spendings.indexOf(valueRemove);
                spendings.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE,convertToString(spendings));
    }

    @Override
    public void editSpending(String id, Spending spending) {
        List<Spending> spendings = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Spending valueEdit : spendings) {
            if (valueEdit.getId().equals(id)) {
                index = spendings.indexOf(valueEdit);
                spendings.set(index, spending);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE,convertToString(spendings));
    }

    @Override
    public Spending searchId(String id) {
        List<Spending> spendings = convertToE(FileUtils.readFile(PATH_FILE));
        for (Spending valueSearch : spendings) {
            if (valueSearch.getId().equals(id)) {
                return valueSearch;

            }
        }
        FileUtils.writeFile(PATH_FILE,convertToString(spendings));
        return null;
    }

    @Override
    public Spending searchName(String name) {
        List<Spending> spendings = convertToE(FileUtils.readFile(PATH_FILE));
        for (Spending valueSearch : spendings) {
            if (valueSearch.getName().contains(name)) {
                return valueSearch;
            }
        }
        FileUtils.writeFile(PATH_FILE,convertToString(spendings));
        return null;
    }

    public List<String> convertToString(List<Spending> e) {
        List<String> strings = new ArrayList<>();
        for (Spending spending : e) {
            strings.add(spending.getId() + COMMA +
                    spending.getName() + COMMA +
                    spending.getDay() + COMMA +
                    spending.getMoney() + COMMA +
                    spending.getDescribe());
        }
        return strings;
    }

    public List<Spending> convertToE(List<String> strings) {
        List<Spending> spendingList = new ArrayList<>();
        for (String str : strings) {
            String[] data = str.split(COMMA);
            spendingList.add(new Spending(data[0], data[1], data[2], Double.parseDouble(data[3]), data[4]));
        }
        return spendingList;
    }
}
