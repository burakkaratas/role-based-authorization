package net.burakkaratas.springsecurity_rolebasedauthorization.repository;

import net.burakkaratas.springsecurity_rolebasedauthorization.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

  public User getUserByUsername(String username);

}
