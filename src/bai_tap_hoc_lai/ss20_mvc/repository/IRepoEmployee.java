package bai_tap_hoc_lai.ss20_mvc.repository;

import bai_tap_hoc_lai.ss20_mvc.model.Employee;

import java.util.List;

public interface IRepoEmployee {
    List<Employee> getList();

    void addEmployee(Employee employee);

    Employee removeEmployee(String id);

    Employee searchIdEmployee(String id);

    List<Employee> searchNameEmployee(String name);
}
