package com.prueba.enums;

public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private String role;

    UserRole(String role){ this.role = role; }

    public String getvalue(){return role;}
}
