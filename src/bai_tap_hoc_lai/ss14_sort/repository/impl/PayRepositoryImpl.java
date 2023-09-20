package bai_tap_hoc_lai.ss14_sort.repository.impl;

import bai_tap_hoc_lai.ss14_sort.model.Pay;
import bai_tap_hoc_lai.ss14_sort.repository.IPayRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PayRepositoryImpl implements IPayRepository {
    private final List<Pay> payList = new ArrayList<>();

    @Override
    public void add(Pay pay) {
        payList.add(pay);
    }

    @Override
    public void removePay(int id) {

    }

    @Override
    public void edit(int id, Pay pay) {

    }

    @Override
    public Pay searchId(int id) {
        return null;
    }

    @Override
    public Pay searchName(String name) {
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
        return payList;
    }
}
