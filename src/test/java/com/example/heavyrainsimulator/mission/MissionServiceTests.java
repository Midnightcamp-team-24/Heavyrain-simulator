package com.example.heavyrainsimulator.mission;

import com.example.heavyrainsimulator.mission.entity.MissionEntity;
import com.example.heavyrainsimulator.mission.service.MissionService;
import org.assertj.core.internal.Integers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class MissionServiceTests {

    @Autowired
    private MissionService missionService;

    @Test
    public void init() {}

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
    @Test
    @Transactional
    void missionClearTest(){
        List<Integer> missionClear = new ArrayList<>(Arrays.asList(1,4,7));

        Assertions.assertDoesNotThrow(
                () -> {
                    missionService.missionClear(missionClear);
                    List<String> mission = missionService.findFailedMission();
                    mission.forEach(System.out::println);
                }
        );
    }


}
