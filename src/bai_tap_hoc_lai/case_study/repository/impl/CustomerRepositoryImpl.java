package bai_tap_hoc_lai.case_study.repository.impl;

import bai_tap_hoc_lai.case_study.model.persion.Customer;
import bai_tap_hoc_lai.case_study.repository.ICustomerRepository;
import bai_tap_hoc_lai.case_study.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\case_study\\data\\customer.csv";
    private final String COMMA = ",";

    public boolean checkId(String id) {
        List<Customer> customerList = this.getList();
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void editCustomer(String id, Customer customer) {
        List<Customer> customers = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Customer valueEdit : customers) {
            if (valueEdit.getId().equals(id)) {
                index = customers.indexOf(valueEdit);
                customers.set(index, customer);
            }
        }
        FileUtils.writeFile(PATH_FILE, covertToString(customers));
    }

    @Override
    public void removeCustomer(String id) {
        List<Customer> customers = convertToE(FileUtils.readFile(PATH_FILE));

        int index;
        for (Customer valueRemove : customers) {
            if (valueRemove.getId().equals(id)) {
                index = customers.indexOf(valueRemove);
                customers.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE, covertToString(customers));
    }

    @Override
    public Customer searchCustomer(String name) {
        List<Customer> customers = convertToE(FileUtils.readFile(PATH_FILE));

        for (Customer valueSearch : customers) {
            if (valueSearch.getName().contains(name)) {
                return valueSearch;
            }
        }
        FileUtils.writeFile(PATH_FILE, covertToString(customers));
        return null;
    }

    @Override
    public void add(Customer customer) {
        List<Customer> customers = convertToE(FileUtils.readFile(PATH_FILE));
        customers.add(customer);
        FileUtils.writeFile(PATH_FILE, covertToString(customers));

    }

    @Override
    public List<Customer> getList() {
        return convertToE(FileUtils.readFile(PATH_FILE));
    }

    public List<String> covertToString(List<Customer> e) {
        List<String> strings = new ArrayList<>();
        for (Customer customer : e) {
            strings.add(customer.getId() + COMMA +
                    customer.getName() + COMMA +
                    customer.getDateOfBirth() + COMMA +
                    customer.getGender() + COMMA +
                    customer.getIdCardNumber() + COMMA +
                    customer.getPhoneNumber() + COMMA +
                    customer.getEmail() + COMMA +
                    customer.getTypeOfGuest() + COMMA +
                    customer.getAddress());
        }
        ;
        return strings;
    }

    public List<Customer> convertToE(List<String> strings) {
        List<Customer> customerList = new ArrayList<>();
        for (String str : strings) {
            if (str.isEmpty()) {
                continue;
            }
            String[] data = str.split(COMMA);
            if (data.length < 9) {
                continue;
            }
            customerList.add(new Customer(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8]));

        }
        return customerList;
    }
}
