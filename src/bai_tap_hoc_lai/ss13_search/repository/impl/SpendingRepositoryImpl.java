package bai_tap_hoc_lai.ss13_search.repository.impl;

import bai_tap_hoc_lai.ss13_search.model.Spending;
import bai_tap_hoc_lai.ss13_search.repository.ISpendingRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SpendingRepositoryImpl implements ISpendingRepository {
    List<Spending> spendings = new ArrayList<>();

    @Override

    public List<Spending> getSpending() {
        spendings.sort(new Comparator<Spending>() {
            @Override
            public int compare(Spending o1, Spending o2) {
                return Integer.parseInt(o1.getId() + Integer.parseInt(o2.getId()));
            }
        });
        return spendings;
    }

    @Override
    public void addSpending(Spending spending) {
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
            if (valueSearch.getName().contains(name)) {
                return valueSearch;
            }
            break;
        }
        return null;
    }
}
