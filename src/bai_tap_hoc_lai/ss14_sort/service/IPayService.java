package bai_tap_hoc_lai.ss14_sort.service;

import bai_tap_hoc_lai.ss14_sort.model.Pay;

public interface IPayService extends IService<Pay> {
    void removePay(int id);

    void edit(int id, Pay pay);

    Pay searchId(int id);

    Pay searchName(String name);
}
