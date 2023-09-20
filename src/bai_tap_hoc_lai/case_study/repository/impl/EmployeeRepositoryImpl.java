package bai_tap_hoc_lai.case_study.repository.impl;

import bai_tap_hoc_lai.case_study.model.persion.Employee;
import bai_tap_hoc_lai.case_study.repository.IEmployeeRepository;
import bai_tap_hoc_lai.case_study.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private final String PATH_FILE = "F:\\C0723G1_TranLinhGiang_Module2\\src\\bai_tap_hoc_lai\\case_study\\data\\employee.csv";
    private final String COMMA = ",";


    @Override
    public void editEmployee(String id, Employee employee) {
        List<Employee> employees = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Employee valueEdit : employees) {
            if (valueEdit.getId().equals(id)) {
                index = employees.indexOf(valueEdit);
                employees.set(index, employee);
            }
        }
        FileUtils.writeFile(PATH_FILE,convertToString(employees));
    }

    @Override
    public void removeEmployee(String id) {
        List<Employee> employees = convertToE(FileUtils.readFile(PATH_FILE));
        int index;
        for (Employee valueRemove : employees) {
            if (valueRemove.getId().equals(id)) {
                index = employees.indexOf(valueRemove);
                employees.remove(index);
                break;
            }
        }
        FileUtils.writeFile(PATH_FILE,convertToString(employees));
    }

    @Override
    public Employee searchEmployee(String id) {
        List<Employee> employees = convertToE(FileUtils.readFile(PATH_FILE));
        for (Employee valueSearch : employees) {
            if (valueSearch.getId().equals(id)) {
                return valueSearch;
            }
        }
        FileUtils.writeFile(PATH_FILE,convertToString(employees));
        return null;
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employees = convertToE(FileUtils.readFile(PATH_FILE));
        employees.add(employee);
        FileUtils.writeFile(PATH_FILE,convertToString(employees));
    }

    @Override
    public List<Employee> getList() {
        return convertToE(FileUtils.readFile(PATH_FILE));
    }

    public List<String> convertToString(List<Employee> e) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : e) {
            strings.add(employee.getId() + COMMA +
                    employee.getName() + COMMA +
                    employee.getDateOfBirth() + COMMA +
                    employee.getGender() + COMMA +
                    employee.getIdCardNumber() + COMMA +
                    employee.getPhoneNumber() + COMMA +
                    employee.getEmail() + COMMA +
                    employee.getLever() + COMMA +
                    employee.getLocation() + COMMA +
                    employee.getSalary());
        }
        return strings;
    }

    public List<Employee> convertToE(List<String> strings) {
        List<Employee> employeeList = new ArrayList<>();
        for (String str : strings) {
            String[] data = str.split(COMMA);
            employeeList.add(new Employee(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], Double.parseDouble(data[9])));

        }
        return employeeList;
    }
}
