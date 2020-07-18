package net.burakkaratas.springsecurity_rolebasedauthorization.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USERS")
public class User {

  @Id
  @Column(name = "USER_ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "VUSERNAME")
  private String username;

  @Column(name = "VPASSWORD")
  private String password;

  @Column(name = "BACTIVE")
  private Boolean isActive;

  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinTable(name = "USERS_ROLES", joinColumns = @JoinColumn(name = "USER_ID"),
      inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
  private Set<Role> roles = new HashSet<>();

}

