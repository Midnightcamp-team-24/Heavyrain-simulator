package com.example.heavyrainsimulator.mission.service;


import com.example.heavyrainsimulator.mission.entity.MissionEntity;
import com.example.heavyrainsimulator.mission.repository.MissionRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MissionService {

    private final MissionRepository missionRepository;

    @Autowired
    public MissionService(MissionRepository missionRepository){
        this.missionRepository = missionRepository;
    }

//    public void insertMission(MissionDTO missionDTO){
//        missionRepository.save(
//                new MissionEntity(
//                        new UserNo(missionDTO.getUserNo()),
//                )
//        )
//    }


}
