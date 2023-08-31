package com.example.heavyrainsimulator.mission.repository;


import com.example.heavyrainsimulator.mission.entity.MissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MissionRepository extends JpaRepository<MissionEntity, Integer> {

    List<MissionEntity> findAll();
}
