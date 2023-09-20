package bai_tap_hoc_lai.case_study.service;

import bai_tap_hoc_lai.case_study.model.persion.Customer;

public interface ICustomerService extends IService<Customer> {
    // da co them, hie thi
    void editCustomer(String id, Customer customer);

    void removeCustomer(String id);

    Customer searchCustomer(String id);
}
