package net.burakkaratas.springsecurity_rolebasedauthorization;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringSecurityRoleBasedAuthorizationApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  void passwordGenerate() {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    System.out.println(encoder.encode("password"));
  }

}
