package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> allUser();

    void createOrUpdate(User user, List<Long> rolesId);

    boolean deleteUser(Long userId);

    @Override
    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;

}
