package com.example.heavyrainsimulator.mission;

import com.example.heavyrainsimulator.mission.entity.MissionEntity;
import com.example.heavyrainsimulator.mission.service.MissionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MissionServiceTests {

    @Autowired
    private MissionService missionService;

    @Test
    void findAllTest(){
        Assertions.assertDoesNotThrow(
                () -> {
                    List<String> mission = missionService.findAllMission();
                    mission.forEach(System.out::println);
                }
        );
    }
    @Test
    void findFailedMission(){

        Assertions.assertDoesNotThrow(
                () -> {
                    List<String> mission = missionService.findFailedMission();
                    mission.forEach(System.out::println);
                }
        );
    }

}
