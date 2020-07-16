package net.burakkaratas.springsecurity_rolebasedauthorization.model;


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "C_ORDER")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "VNAME")
  private String name;

  @Column(name = "DPRICE")
  private BigDecimal price;

  @Column(name = "VDESCRIPTION")
  private String description;

}
