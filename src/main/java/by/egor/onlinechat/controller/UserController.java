package by.egor.onlinechat.controller;

import by.egor.onlinechat.model.User;
import by.egor.onlinechat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService service;

    @GetMapping("/user")
    public Authentication test() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    @GetMapping("/get")
    public List<User> getAll() {
        return service.findAllUsers();
    }

    @GetMapping("/message")
    public String message() {
        return "Hello Admin";
    }
}
