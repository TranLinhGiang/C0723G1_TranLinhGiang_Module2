package bai_tap_hoc_lai.ss17_binary_file.repository.impl;

import bai_tap_hoc_lai.ss16_io_text_file.model.Job;
import bai_tap_hoc_lai.ss17_binary_file.model.Spending;
import bai_tap_hoc_lai.ss17_binary_file.repository.ISpendRepository;

import java.util.ArrayList;
import java.util.List;

public class SpendingRepositoryImpl implements ISpendRepository {
    List<Spending> spendingList = new ArrayList<>();

    public boolean checkId(int id) {
        List<Spending> spending = this.getList();
        for (Spending spend : spending) {
            if (spend.getId()== id)
                return true;
        }
        return false;
    }

    @Override
    public List<Spending> getList() {
        return spendingList;
    }

    @Override
    public void addSpending(Spending spending) {
        spendingList.add(spending);
    }

    @Override
    public void removeSpending(int id) {
        int index;
        for (Spending valueRemove : spendingList) {
            if (valueRemove.getId() == id) {
                index = spendingList.indexOf(valueRemove);
                spendingList.remove(index);
                break;
            } else {
                System.out.println("id ban nhap ko trung khop trong danh sach !!!!");
            }
        }
    }

    @Override
    public void editSpending(int id, Spending spending) {
        int index;
        for (Spending valueEdit : spendingList) {
            if (valueEdit.getId() == (id)) {
                index = spendingList.indexOf(valueEdit);
                spendingList.set(index, spending);
                break;
            } else {
                System.out.println("id ban nhap ko trung khop trong danh sach !!!!");
            }
        }
    }


    @Override
    public Spending searchIdSpend(int id) {
        for (Spending valueSearch : spendingList) {
            if (valueSearch.getId() == (id)) {
                return valueSearch;
            } else {
                System.out.println("id ban nhap ko trung khop trong danh sach !!!!");
            }
        }
        return null;
    }

    @Override
    public List<Spending> searchNameSpend(String name) {
        List<Spending> result = new ArrayList<>();
        for (Spending valueSearchName : spendingList) {
            if (valueSearchName.getName().equals(name)) {
                result.add(valueSearchName);
            } else {
                System.out.println("ten ban nhap ko trung khop trong danh sach !!!!");
            }
        }
        return result;
    }
}
