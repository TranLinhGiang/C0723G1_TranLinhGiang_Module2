package bai_tap_hoc_lai.case_study.service.impl;

import bai_tap_hoc_lai.case_study.model.persion.Customer;
import bai_tap_hoc_lai.case_study.repository.impl.CustomerRepositoryImpl;
import bai_tap_hoc_lai.case_study.service.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private static CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();

    @Override
    public void editCustomer(String id, Customer customer) {
        customerRepository.editCustomer(id, customer);
    }

    @Override
    public void removeCustomer(String id) {
        customerRepository.removeCustomer(id);
    }

    @Override
    public Customer searchCustomer(String name) {
        return customerRepository.searchCustomer(name);
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public List<Customer> getList() {
        return customerRepository.getList();
    }
}
