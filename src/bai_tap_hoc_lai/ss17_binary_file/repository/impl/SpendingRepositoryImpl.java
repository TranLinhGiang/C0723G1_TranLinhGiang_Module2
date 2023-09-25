package bai_tap_hoc_lai.ss17_binary_file.repository.impl;

import bai_tap_hoc_lai.ss17_binary_file.model.Spending;
import bai_tap_hoc_lai.ss17_binary_file.repository.ISpendRepository;
import bai_tap_hoc_lai.ss17_binary_file.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class SpendingRepositoryImpl implements ISpendRepository {
    private final String PATH_FILE="F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\ss17_binary_file\\data\\data.dat";


    public boolean checkId(int id) {
        List<Spending> spending = this.getList();
        for (Spending spend : spending) {
            if (spend.getId() == id)
                return true;
        }
        return false;
    }

    @Override
    public List<Spending> getList() {
        List<Spending> spendingList = FileUtils.readFile(PATH_FILE);
        return spendingList;

    }

    @Override
    public void addSpending(Spending spending) {
        List<Spending>spendingList= this.getList();
        spendingList.add(spending);
        FileUtils.writeFile(PATH_FILE,spendingList);
    }

    @Override
    public void removeSpending(int id) {
        List<Spending>spendingList= this.getList();
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
        FileUtils.writeFile(PATH_FILE,spendingList);
    }

    @Override
    public void editSpending(int id, Spending spending) {
        List<Spending>spendingList= this.getList();
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
        FileUtils.writeFile(PATH_FILE,spendingList);
    }


    @Override
    public Spending searchIdSpend(int id) {
        List<Spending>spendingList= this.getList();
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
        List<Spending>spendingList= this.getList();
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
