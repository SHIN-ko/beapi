package com.shs.beapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserDto {
    private String userId;
    private String name;
    private String password;
    private String regNo;
}
