package net.burakkaratas.springsecurity_rolebasedauthorization.service;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import net.burakkaratas.springsecurity_rolebasedauthorization.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailService implements UserDetails {

  private final User user;

  public UserDetailService(User user) {
    this.user = user;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return user.getRoles().stream().filter(Objects::nonNull)
        .map(item -> new SimpleGrantedAuthority(item.getName()))
        .collect(Collectors.toList());
  }

  @Override
  public String getPassword() {
    return user.getPassword();
  }

  @Override
  public String getUsername() {
    return user.getUsername();
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return user.getIsActive();
  }
}
