package bai_tap_hoc_lai.ss20_mvc.service.impl;

import bai_tap_hoc_lai.ss20_mvc.model.Employee;
import bai_tap_hoc_lai.ss20_mvc.repository.impl.EmployeeRepositoryImpl;
import bai_tap_hoc_lai.ss20_mvc.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private final EmployeeRepositoryImpl employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public List<Employee> getList() {
        return employeeRepository.getList();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    @Override
    public Employee removeEmployee(String id) {
        employeeRepository.removeEmployee(id);
        return null;
    }

    @Override
    public Employee searchIdEmployee(String id) {
        return employeeRepository.searchIdEmployee(id);
    }

    @Override
    public List<Employee> searchNameEmployee(String name) {
       return employeeRepository.searchNameEmployee(name);
    }
}
