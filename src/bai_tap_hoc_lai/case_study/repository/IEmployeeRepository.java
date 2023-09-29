package bai_tap_hoc_lai.case_study.repository;

import bai_tap_hoc_lai.case_study.model.persion.Employee;

public interface IEmployeeRepository extends IRepo<Employee> {
    Employee editEmployee(String id, Employee employee);

    Employee removeEmployee(String id);

    Employee searchEmployee(String id);
}
