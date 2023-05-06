package com.cnt.healthAPI.repository;

import com.cnt.healthAPI.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeamRepository extends JpaRepository<Team, Long> {
}
