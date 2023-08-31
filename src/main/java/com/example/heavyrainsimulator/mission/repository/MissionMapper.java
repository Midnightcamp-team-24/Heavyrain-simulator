package com.example.heavyrainsimulator.mission.repository;

import com.example.heavyrainsimulator.mission.entity.MissionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MissionMapper {

    List<MissionEntity> failedMission();

}
