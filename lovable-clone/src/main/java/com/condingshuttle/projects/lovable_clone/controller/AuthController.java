package com.condingshuttle.projects.lovable_clone.controller;

import com.condingshuttle.projects.lovable_clone.Dto.auth.AuthResponse;
import com.condingshuttle.projects.lovable_clone.Dto.auth.LoginRequest;
import com.condingshuttle.projects.lovable_clone.Dto.auth.SignUpRequest;
import com.condingshuttle.projects.lovable_clone.Dto.auth.UserProfileResponse;
import com.condingshuttle.projects.lovable_clone.service.AuthService;
import com.condingshuttle.projects.lovable_clone.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class AuthController {

   AuthService authService;
   UserService userService;

  @PostMapping("/signup")
  public ResponseEntity<AuthResponse> signUp(@RequestBody SignUpRequest request){
      return  ResponseEntity.ok(authService.signUp(request));
  }
  @PostMapping("/login")
  public ResponseEntity<AuthResponse> login(@RequestBody  LoginRequest request){
      return ResponseEntity.ok(authService.login(request));
  }
    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse>  getProfile(){
      Long userId = 1L;
      return ResponseEntity.ok(userService.getProfile());
    }






}
