package net.burakkaratas.springsecurity_rolebasedauthorization.service;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import net.burakkaratas.springsecurity_rolebasedauthorization.model.Order;
import net.burakkaratas.springsecurity_rolebasedauthorization.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

  private final OrderRepository orderRepository;

  @Override
  public List<Order> getAllOrders() {
    return orderRepository.findAll();
  }

  @Override
  public void saveOrder(Order order) {
    this.orderRepository.save(order);
  }

  @Override
  public Order getOrderById(Long id) {
    final Optional<Order> orderOptional = this.orderRepository.findById(id);
    Order order;
    if (orderOptional.isPresent()) {
      order = orderOptional.get();
    } else {
      throw new RuntimeException("Not Found Order");
    }
    return order;
  }

  @Override
  public void deleteOrderById(Long id) {
    this.orderRepository.deleteById(id);
  }
}
