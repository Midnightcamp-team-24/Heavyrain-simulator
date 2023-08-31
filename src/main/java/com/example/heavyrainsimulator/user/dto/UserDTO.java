package com.example.heavyrainsimulator.user.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {

    private int userNum;

    private String userName;

    private String password;

    private String clearInfo;
}
