package bai_tap_hoc_lai.ss14_sort.repository.impl;

import bai_tap_hoc_lai.ss14_sort.model.Pay;
import bai_tap_hoc_lai.ss14_sort.repository.IPayRepository;
import bai_tap_hoc_lai.ss14_sort.utils.FileUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PayRepositoryImpl implements IPayRepository {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\ss14_sort\\data\\pay.csv";
    private final String COMMA = ",";


    @Override
    public void add(Pay pay) {
        List<Pay> payList = convertToE(FileUtils.readFile(PATH_FILE));
        payList.add(pay);
        FileUtils.writeFile(PATH_FILE,convertToString(payList));
    }

    @Override
    public void removePay(int id) {
        List<Pay> payList = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Pay valueRemove : payList) {
            if (valueRemove.getId() == id) {
                index = payList.indexOf(valueRemove);
                payList.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE,convertToString(payList));
    }

    @Override
    public void edit(int id, Pay pay) {
        List<Pay> payList = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Pay valueEdit : payList) {
            if (valueEdit.getId() == id) {
                index = payList.indexOf(valueEdit);
                payList.set(index, pay);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE,convertToString(payList));
    }

    @Override
    public Pay searchId(int id) {
        List<Pay> payList = convertToE(FileUtils.readFile(PATH_FILE));
        for (Pay valueSearchId : payList) {
            if (valueSearchId.getId() == id) {
                return valueSearchId;
            }
        }
        FileUtils.writeFile(PATH_FILE,convertToString(payList));
        return null;
    }

    @Override
    public Pay searchName(String name) {
        List<Pay> payList = convertToE(FileUtils.readFile(PATH_FILE));
        for (Pay valueSearch : payList) {
            if (valueSearch.getName().contains(name)) {
                return valueSearch;
            }
        }
        FileUtils.writeFile(PATH_FILE,convertToString(payList));
        return null;
    }


    @Override
    public List<Pay> getList() {
        List<Pay> payList = convertToE(FileUtils.readFile(PATH_FILE));
        payList.sort(new Comparator<Pay>() {
            @Override
            public int compare(Pay o1, Pay o2) {
                return (o1.getName().compareTo(o2.getName()));
            }
        });
        payList.sort(new Comparator<Pay>() {
            @Override
            public int compare(Pay o1, Pay o2) {
                return Double.compare(o1.getMoney(), o2.getMoney());
            }
        });
        FileUtils.writeFile(PATH_FILE,convertToString(payList));
        return payList;
    }

    public List<String> convertToString(List<Pay> e) {
        List<String> strings = new ArrayList<>();
        for (Pay pay : e) {
            strings.add(pay.getId() + COMMA +
                    pay.getName() + COMMA +
                    pay.getDay() + COMMA +
                    pay.getMoney() + COMMA +
                    pay.getDescribe());
        }
        return strings;
    }

    public List<Pay> convertToE(List<String> strings) {
        List<Pay> payList1 = new ArrayList<>();
        for (String str : strings) {
            String[] data = str.split(COMMA);
            payList1.add(new Pay(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3]), data[4]));

        }
        return payList1;
    }
}
