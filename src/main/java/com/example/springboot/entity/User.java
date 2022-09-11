package com.example.springboot.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private Integer id;
    private String  username;
    private String  password;
    private String nickname;
    private String email;
    private String phone;
    private String address;


}
