package net.burakkaratas.springsecurity_rolebasedauthorization.service;

import net.burakkaratas.springsecurity_rolebasedauthorization.model.User;
import net.burakkaratas.springsecurity_rolebasedauthorization.repository.UserRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    final User user = userRepository.getUserByUsername(username);
    if (null == user) {
      throw new UsernameNotFoundException("Not Found User");
    }
    return new UserDetailService((User) Hibernate.unproxy(user));
  }
}
