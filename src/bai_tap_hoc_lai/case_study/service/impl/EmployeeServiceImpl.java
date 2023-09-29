package bai_tap_hoc_lai.case_study.service.impl;

import bai_tap_hoc_lai.case_study.model.persion.Employee;
import bai_tap_hoc_lai.case_study.repository.impl.EmployeeRepositoryImpl;
import bai_tap_hoc_lai.case_study.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private final EmployeeRepositoryImpl employeeRepository= new EmployeeRepositoryImpl();


    @Override
    public Employee editEmployee(String id, Employee employee) {
       return employeeRepository.editEmployee(id,employee);
    }

    @Override
    public Employee removeEmployee(String id) {
       return employeeRepository.removeEmployee(id);
    }

    @Override
    public Employee searchEmployee(String id) {
        return employeeRepository.searchEmployee(id);
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);
    }

    @Override
    public List<Employee> getList() {
        return employeeRepository.getList();
    }
}
