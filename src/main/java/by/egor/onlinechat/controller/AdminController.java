package by.egor.onlinechat.controller;


import by.egor.onlinechat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final UserService service;

    @GetMapping("/message")
    public String message() {
        return "Hello Admin";
    }

}
