package com.example.heavyrainsimulator.mission.service;


import com.example.heavyrainsimulator.mission.entity.MissionEntity;
import com.example.heavyrainsimulator.mission.repository.MissionMapper;
import com.example.heavyrainsimulator.mission.repository.MissionRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MissionService {

    private final MissionRepository missionRepository;
    private final MissionMapper missionMapper;

    @Autowired
    public MissionService(MissionRepository missionRepository, MissionMapper missionMapper){
        this.missionRepository = missionRepository;
        this.missionMapper = missionMapper;
    }


    public List<String> findAllMission(){
        List<MissionEntity> AllEntityMission = new ArrayList<>(missionRepository.findAll());
        List<String> AllMission = new ArrayList<>();
        for(int i = 0; i < AllEntityMission.size(); i++){
            AllMission.add(AllEntityMission.get(i).getMissionName());
        }
        return AllMission;
    }

    public List<String> findFailedMission(){
        List<MissionEntity> failedMission = new ArrayList<>(missionMapper.failedMission());
        List<String> failedMissionName = new ArrayList<>();
        for (int i = 0; i<failedMission.size(); i++){
            failedMissionName.add(failedMission.get(i).getMissionName());
        }
        return failedMissionName;
    }

    public void missionClear(List<Integer> missionClear){
        missionMapper.missionClear(missionClear);
    }



}
