package com.example.heavyrainsimulator.mission.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;


import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "TBL_MISSION")
@ToString
public class MissionEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer missionNo;

    @Column
    private String missionName;

    @Column
    @ColumnDefault("false")
    private Boolean missionClear;


}
