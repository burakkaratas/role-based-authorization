package net.burakkaratas.springsecurity_rolebasedauthorization.repository;

import net.burakkaratas.springsecurity_rolebasedauthorization.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
