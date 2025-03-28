package com.example.springboot.User;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.management.relation.Role;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class UserResponseDto {
    private long id;
    private String username;
    private String email;
    private Role role;
    private LocalDateTime regDateAndTime;

}
