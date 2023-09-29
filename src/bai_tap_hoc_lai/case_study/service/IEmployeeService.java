package bai_tap_hoc_lai.case_study.service;

import bai_tap_hoc_lai.case_study.model.persion.Employee;

public interface IEmployeeService extends IService<Employee> {
    Employee editEmployee(String id, Employee employee);

    Employee removeEmployee(String id);

    Employee searchEmployee(String name);
}
