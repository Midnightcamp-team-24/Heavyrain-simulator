package com.example.heavyrainsimulator.mission.controller;

import com.example.heavyrainsimulator.mission.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MissionController {
    private final MissionService missionService;

    @Autowired
    public MissionController(MissionService missionService){
        this.missionService = missionService;
    }

    @GetMapping("/allMission")
    public List<String> findAllMission(){
        return missionService.findAllMission();
    }
    @GetMapping("/failedMission")
    public List<String> findFailedMission(){
        return missionService.findFailedMission();
    }

    @PostMapping("/missionClear")
    public void missionClear(@RequestBody List<Integer> clearList){
        missionService.missionClear(clearList);
    }

}
