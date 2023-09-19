package bai_tap_hoc_lai.ss13_search.repository.impl;

import bai_tap_hoc_lai.ss13_search.model.Spending;
import bai_tap_hoc_lai.ss13_search.repository.ISpendingRepository;
import bai_tap_hoc_lai.ss13_search.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class SpendingRepositoryImpl implements ISpendingRepository {
    private final String PATH_FILE = "";
    private final String COMMA = ",";

    List<Spending> spendings = new ArrayList<>();

    @Override

    public List<Spending> getSpending() {
//        List<Spending> spendings = convertToE(FileUtils.readFile(PATH_FILE));
        return this.spendings;
    }

    @Override
    public void addSpending(Spending spending) {
//        List<Spending> spendings = convertToE(FileUtils.readFile(PATH_FILE));
        spendings.add(spending);
    }

    @Override
    public void removeSpending(String id) {
        int index;
        for (Spending valueRemove : spendings) {
            if (valueRemove.getId().equals(id)) {
                index = spendings.indexOf(valueRemove);
                spendings.remove(index);
                break;
            }
        }
    }

    @Override
    public void editSpending(String id, Spending spending) {
        int index;
        for (Spending valueEdit : spendings) {
            if (valueEdit.getId().equals(id)) {
                index = spendings.indexOf(valueEdit);
                spendings.set(index, spending);
                break;
            }
        }
    }

    @Override
    public Spending searchId(String id) {
        for (Spending valueSearch : spendings) {
            if (valueSearch.getId().equals(id)) {
                return valueSearch;

            }
            break;
        }
        return null;
    }

    @Override
    public Spending searchName(String name) {
        for (Spending valueSearch : spendings) {
            if (valueSearch.getId().contains(name)) {
                return valueSearch;
            }
            break;
        }
        return null;
    }
}
