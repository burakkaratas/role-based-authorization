package net.burakkaratas.springsecurity_rolebasedauthorization.service;

import java.util.List;
import net.burakkaratas.springsecurity_rolebasedauthorization.model.Order;

public interface OrderService {

  List<Order> getAllOrders();

  void saveOrder(Order order);

  Order getOrderById(Long id);

  void deleteOrderById(Long id);

}
