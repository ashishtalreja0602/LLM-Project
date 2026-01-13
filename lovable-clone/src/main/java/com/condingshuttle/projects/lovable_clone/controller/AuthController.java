package com.condingshuttle.projects.lovable_clone.controller;

import com.condingshuttle.projects.lovable_clone.Dto.auth.AuthResponse;
import com.condingshuttle.projects.lovable_clone.Dto.auth.LoginRequest;
import com.condingshuttle.projects.lovable_clone.Dto.auth.SignUpRequest;
import com.condingshuttle.projects.lovable_clone.Dto.auth.UserProfileResponse;
import com.condingshuttle.projects.lovable_clone.service.AuthService;
import com.condingshuttle.projects.lovable_clone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

  private AuthService authService;
  private UserService userService;

  @PostMapping("/signup")
  public ResponseEntity<AuthResponse> signUp(SignUpRequest request){
      return  ResponseEntity.ok(authService.signUp(request));
  }
  @PostMapping("/login")
  public ResponseEntity<AuthResponse> login(LoginRequest request){
      return ResponseEntity.ok(authService.login(request));
  }
    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse>  getProfile(){
      Long userId = 1L;
      return ResponseEntity.ok(userService.getProfile());
    }






}
