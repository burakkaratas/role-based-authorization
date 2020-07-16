package net.burakkaratas.springsecurity_rolebasedauthorization.controller;

import lombok.RequiredArgsConstructor;
import net.burakkaratas.springsecurity_rolebasedauthorization.model.Order;
import net.burakkaratas.springsecurity_rolebasedauthorization.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class OrderController {

  private final OrderService orderService;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("listOrders", orderService.getAllOrders());
    return "index";
  }

  @GetMapping("/showNewOrderForm")
  public String showNewOrderForm(Model model) {
    Order order = new Order();
    model.addAttribute("order", order);
    return "new_order";
  }

  @PostMapping("/saveOrder")
  public String saveOrder(@ModelAttribute("order") Order order) {
    orderService.saveOrder(order);
    return "redirect:/";
  }

  @GetMapping("/showFormForUpdate/{id}")
  public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model) {
    Order order = orderService.getOrderById(id);
    model.addAttribute("order", order);
    return "edit_order";
  }

  @GetMapping("/deleteOrder/{id}")
  public String deleteOrder(@PathVariable(value = "id") Long id) {
    orderService.deleteOrderById(id);
    return "redirect:/";
  }
}
