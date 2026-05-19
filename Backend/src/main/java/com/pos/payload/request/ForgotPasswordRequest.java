package com.pos.payload.request;

import lombok.Data;

@Data
public class ForgotPasswordRequest {
    private String email;
}
