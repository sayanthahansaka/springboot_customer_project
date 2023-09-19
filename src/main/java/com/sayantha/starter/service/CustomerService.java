package com.sayantha.starter.service;

import com.sayantha.starter.dto.CustomerDTO;


import java.util.List;

public interface CustomerService {
    public void saveCustomer(CustomerDTO dto);

    public void deleteCustomer(String id);

    public void updateCustomer(CustomerDTO dto);

    public CustomerDTO searchCustomer(String id);

    public List<CustomerDTO> getAllCustomer();

}
