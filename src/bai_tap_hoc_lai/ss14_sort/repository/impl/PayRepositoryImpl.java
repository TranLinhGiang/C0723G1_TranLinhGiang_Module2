package bai_tap_hoc_lai.ss14_sort.repository.impl;

import bai_tap_hoc_lai.ss14_sort.model.Pay;
import bai_tap_hoc_lai.ss14_sort.repository.IPayRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PayRepositoryImpl implements IPayRepository {
    List<Pay> payList = new ArrayList<>();

    @Override
    public void add(Pay pay) {
        payList.add(pay);
    }

    @Override
    public void removePay(int id) {
        int index;
        for (Pay valueRemove : payList) {
            if (valueRemove.getId() == id) {
                index = payList.indexOf(valueRemove);
                payList.remove(index);
                break;
            }
        }

    }

    @Override
    public void edit(int id, Pay pay) {
        int index;
        for (Pay valueEdit : payList) {
            if (valueEdit.getId() == id) {
                index = payList.indexOf(valueEdit);
                payList.set(index, pay);
                break;
            }
        }
    }

    @Override
    public Pay searchId(int id) {
        for (Pay valueSearchId : payList) {
            if (valueSearchId.getId() == id) {
                return valueSearchId;
            }
        }
        return null;
    }

    @Override
    public Pay searchName(String name) {
        for (Pay valueSearch : payList) {
            if (valueSearch.getName().contains(name)) {
                return valueSearch;
            }
        }
        return null;
    }


    @Override
    public List<Pay> getList() {
        payList.sort(new Comparator<Pay>() {
            @Override
            public int compare(Pay o1, Pay o2) {
                return (o1.getName().compareTo(o2.getName()));
            }
        });
        payList.sort(new Comparator<Pay>() {
            @Override
            public int compare(Pay o1, Pay o2) {
                return Double.compare(o1.getMoney(),o2.getMoney());
            }
        });
        return payList;
    }
}
