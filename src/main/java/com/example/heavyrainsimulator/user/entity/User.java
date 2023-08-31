package com.example.heavyrainsimulator.user.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "User")
@Table(name = "USER")
@SequenceGenerator(
        name = "USER_SEQ_GENERATOR",
        sequenceName = "SEQ_USER_NUM",
        initialValue = 1,
        allocationSize = 1
)
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "USER_SEQ_GENERATOR"
    )
    @Column(name = "USER_NUM")
    private int userNum;

    @Column(name = "USER_NICKNAME")
    private String userNickname;

    @Column(name = "CLEAR_INFO")
    private int clear_info;


}
