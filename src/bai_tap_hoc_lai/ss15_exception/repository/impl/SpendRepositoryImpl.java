package bai_tap_hoc_lai.ss15_exception.repository.impl;

import bai_tap_hoc_lai.ss15_exception.model.Spend;
import bai_tap_hoc_lai.ss15_exception.repository.ISpendRepository;
import bai_tap_hoc_lai.ss15_exception.utils.FileUtils;
import sun.plugin2.ipc.windows.WindowsIPCFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SpendRepositoryImpl implements ISpendRepository {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\ss15_exception\\data\\spend.csv";
    private final String COMMA = ",";

    public boolean checkId(int id) {
        List<Spend> spendList = this.getList();
        for (Spend spend : spendList) {
           if (spend.getId()== id){
               return true;
           }
        }
        return false;
    }

    @Override
    public void add(Spend spend) {
        List<Spend> spendList = convertToE(FileUtils.readFile(PATH_FILE));
        spendList.add(spend);
        FileUtils.writeFile(PATH_FILE, convertToString(spendList));
    }

    @Override
    public List<Spend> getList() {
        List<Spend> spendList = convertToE(FileUtils.readFile(PATH_FILE));
        spendList.sort(new Comparator<Spend>() {
            @Override
            public int compare(Spend o1, Spend o2) {
                return (Double.compare(o1.getMoney(), o2.getMoney()));
            }
        });
        return spendList;
    }

    @Override
    public void removeSpend(int id) {
        List<Spend> spendList = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Spend valueRemove : spendList) {
            if (valueRemove.getId() == (id)) {
                index = spendList.indexOf(valueRemove);
                spendList.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(spendList));
    }

    @Override
    public void editSpend(int id, Spend spend) {
        List<Spend> spendList = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Spend valueEdit : spendList) {
            if (valueEdit.getId() == (id)) {
                index = spendList.indexOf(valueEdit);
                spendList.set(index, spend);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(spendList));
    }

    @Override
    public Spend searchIdSpend(int id) {
        List<Spend> spendList = convertToE(FileUtils.readFile(PATH_FILE));
        for (Spend valueSearchId : spendList) {
            if (valueSearchId.getId() == (id)) {
                return valueSearchId;
            }
        }
        return null;
    }

    @Override
    public List<Spend> searchNameSpend(String name) {
        List<Spend> result = new ArrayList<>();
        List<Spend> spendList = convertToE(FileUtils.readFile(PATH_FILE));
        for (Spend valueNameSearch : spendList) {
            if (valueNameSearch.getName().contains(name)) {
                result.add(valueNameSearch);
            }
        }
        return result;
    }

    public List<String> convertToString(List<Spend> e) {
        List<String> strings = new ArrayList<>();
        for (Spend spend : e) {
            strings.add(spend.getId() + COMMA +
                    spend.getName() + COMMA +
                    spend.getDate() + COMMA +
                    spend.getMoney() + COMMA +
                    spend.getDescribe());
        }
        return strings;
    }

    public List<Spend> convertToE(List<String> strings) {
        List<Spend> spends = new ArrayList<>();
        for (String str : strings) {
            String[] data = str.split(COMMA);
            spends.add(new Spend(Integer.parseInt(data[0]), data[1], data[2], Double.parseDouble(data[3]), data[4]));
        }
        return spends;
    }
}
