package com.example.heavyrainsimulator.userMission.Entity;

import com.example.heavyrainsimulator.mission.entity.MissionEntity;

import javax.persistence.*;

@Table(name = "tbl_userMission")
@Entity
public class userMissionEntity {

    @Id
    @Column(name = "userMission_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    private User userid;

    @ManyToOne
    @JoinColumn(name = "mission_ID")
    private MissionEntity mission;
}
