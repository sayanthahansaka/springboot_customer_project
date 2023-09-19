package com.sayantha.starter.repo;

import com.sayantha.starter.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepo extends JpaRepository<Customer, String> {
    Customer getCustomerById(String id);
}
