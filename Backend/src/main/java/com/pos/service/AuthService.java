package com.pos.service;

import com.pos.exception.UserException;
import com.pos.payload.dto.UserDTO;
import com.pos.payload.response.AuthResponse;

public interface AuthService {
    AuthResponse login(String username, String password) throws UserException;
    AuthResponse signup(UserDTO req) throws UserException;

    void createPasswordResetToken(String email) throws UserException;
    void resetPassword(String token, String newPassword);
}
