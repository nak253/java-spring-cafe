package com.kakao.cafe.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kakao.cafe.domain.users.User;
import com.kakao.cafe.domain.users.UserDto;
import com.kakao.cafe.domain.users.UserProfileDto;
import com.kakao.cafe.domain.users.UserRepository;

@Controller
public class UserController {

    private final UserRepository userRepository = new UserRepository(new ArrayList<>());
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/users")
    public String addUser(User user) {
        userRepository.save(user);
        return "redirect:/users";
    }

    @GetMapping("/users")
    public String showUsers(Model model) {
        List<UserDto> userDtoList = userRepository.findAll();
        model.addAttribute("users", userDtoList);
        return "list";
    }

    @GetMapping("/users/{userId}")
    public String showUserProfile(@PathVariable String userId, Model model) {
        UserProfileDto userProfileDto = userRepository.findByUserId(userId);
        model.addAttribute("userProfile", userProfileDto);
        return "profile";
    }
}
