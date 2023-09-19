package com.sayantha.starter.repo;

import com.sayantha.starter.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderDetails, String> {
    OrderDetails getOrderDetailsByOrderID(String id);
}
