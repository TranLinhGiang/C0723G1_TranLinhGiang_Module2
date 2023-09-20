package bai_tap_hoc_lai.case_study.repository;

import bai_tap_hoc_lai.case_study.model.persion.Customer;

public interface ICustomerRepository extends IRepo<Customer> {
    void editCustomer(String id, Customer customer);

    void removeCustomer(String id);

    Customer searchCustomer(String name);
}
