package com.sayantha.starter.service;

import com.sayantha.starter.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    public void saveOrder(OrderDTO dto);

    public void deleteOrder(String id);

    public void updateOrder(OrderDTO dto);

    public OrderDTO searchOrder(String id);

    public List<OrderDTO> getAllOrder();

}
