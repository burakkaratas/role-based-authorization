package net.burakkaratas.springsecurity_rolebasedauthorization.repository;

import net.burakkaratas.springsecurity_rolebasedauthorization.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {

  @Query("select user from User user where user.username = :username")
  public User getUserByUsername(@Param("username") String username);

}
