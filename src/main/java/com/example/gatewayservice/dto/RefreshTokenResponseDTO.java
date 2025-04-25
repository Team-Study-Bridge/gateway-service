package com.example.gatewayservice.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RefreshTokenResponseDTO {
    private boolean success;
    private String accessToken;
    private String message;
}

