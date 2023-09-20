package bai_tap_hoc_lai.case_study.repository;

import bai_tap_hoc_lai.case_study.model.persion.Employee;

public interface IEmployeeRepository extends IRepo<Employee> {
    void editEmployee(String id, Employee employee);

    void removeEmployee(String id);

    Employee searchEmployee(String id);
}
