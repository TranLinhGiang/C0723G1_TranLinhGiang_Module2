package bai_tap_hoc_lai.ss20_mvc.repository.impl;

import bai_tap_hoc_lai.ss20_mvc.model.Employee;
import bai_tap_hoc_lai.ss20_mvc.repository.IRepoEmployee;
import bai_tap_hoc_lai.ss20_mvc.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IRepoEmployee {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\ss20_mvc\\data\\manage.csv";
    private final String COMMA = ",";

    public boolean checkId(String id) {
        List<Employee> employees = this.getList();
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> getList() {
        return convertToE(FileUtils.readFile(PATH_FILE));
    }

    @Override
    public void addEmployee(Employee employee) {
        List<Employee> employeeList = convertToE(FileUtils.readFile(PATH_FILE));
        employeeList.add(employee);
        FileUtils.writeFile(PATH_FILE, convertToString(employeeList));
    }

    @Override
    public Employee removeEmployee(String id) {
        List<Employee> employeeList = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Employee valueRemove : employeeList) {
            if (valueRemove.getId().equals(id)) {
                index = employeeList.indexOf(valueRemove);
                employeeList.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE, convertToString(employeeList));
        return null;
    }

    @Override
    public Employee searchIdEmployee(String id) {
        List<Employee> employeeList = convertToE(FileUtils.readFile(PATH_FILE));
        for (Employee valueSearchId : employeeList) {
            if (valueSearchId.getId().equals(id)) {
                return valueSearchId;
            }
        }
        return null;
    }

    @Override
    public List<Employee> searchNameEmployee(String name) {
        List<Employee> employeeList = convertToE(FileUtils.readFile(PATH_FILE));
        List<Employee> employees = this.getList();
        List<Employee> result = new ArrayList<>();
        for (Employee valueSearchName : employeeList) {
            if (valueSearchName.getName().contains(name)) {
                result.add(valueSearchName);
            } else {
                System.out.println("ten ban nhap khong trung khop danh sach");
            }
        }
        return result;
    }

    public List<String> convertToString(List<Employee> e) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : e) {
            strings.add(employee.getId() + COMMA +
                    employee.getName() + COMMA +
                    employee.getAge() + COMMA +
                    employee.getDateOfBirthday() + COMMA +
                    employee.getAddress() + COMMA +
                    employee.getLever());
        }
        return strings;
    }

    public List<Employee> convertToE(List<String> strings) {
        List<Employee> employees = new ArrayList<>();
        for (String str : strings) {
            if (str.isEmpty()) {
                continue;
            }
            String[] data = str.split(COMMA);
            employees.add(new Employee(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4], data[5]));
        }
        return employees;
    }
}
