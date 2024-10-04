package com.prueba.dtos;

import com.prueba.enums.UserRole;

public record SignUpDto(
        String login,
        String password,
        UserRole role
) {
}
