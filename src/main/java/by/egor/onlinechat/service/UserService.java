package by.egor.onlinechat.service;

import by.egor.onlinechat.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> findAllUsers();

    User getByLogin(String login);

}
