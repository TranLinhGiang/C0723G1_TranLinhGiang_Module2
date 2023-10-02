package bai_tap_hoc_lai.ss20_mvc.service;

import bai_tap_hoc_lai.ss20_mvc.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getList();

    void addEmployee(Employee employee);

    Employee removeEmployee(String id);

    Employee searchIdEmployee(String id);

    List<Employee> searchNameEmployee(String name);
}
