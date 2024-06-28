package me.dio.santander_dev_week_2024.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.santander_dev_week_2024.domain.model.User;
import me.dio.santander_dev_week_2024.service.UserService;

@RestController
@RequestMapping("/users")

// service layer
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  // search user by id
  @GetMapping("/{id}")
  public ResponseEntity<User> findById(@PathVariable Long id) {
    var user = userService.findById(id);
    return ResponseEntity.ok(user);
  }
}
