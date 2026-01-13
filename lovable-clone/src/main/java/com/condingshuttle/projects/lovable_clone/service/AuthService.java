package com.condingshuttle.projects.lovable_clone.service;

import com.condingshuttle.projects.lovable_clone.Dto.auth.AuthResponse;
import com.condingshuttle.projects.lovable_clone.Dto.auth.LoginRequest;
import com.condingshuttle.projects.lovable_clone.Dto.auth.SignUpRequest;

public interface AuthService {
    AuthResponse signUp(SignUpRequest request);

    AuthResponse login(LoginRequest request);
}
