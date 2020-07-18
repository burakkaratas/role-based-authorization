package net.burakkaratas.springsecurity_rolebasedauthorization.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ROLE")
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ROLE_ID")
  private Long id;

  @Column(name = "VNAME")
  private String name;

}
