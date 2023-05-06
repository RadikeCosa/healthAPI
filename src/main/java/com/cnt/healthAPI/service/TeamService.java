package com.cnt.healthAPI.service;

import com.cnt.healthAPI.model.Team;
import com.cnt.healthAPI.repository.ITeamRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService implements ITeamService{

    @Autowired
    private ITeamRepository iTeamRepository;


    @Override
    public List<Team> getTeam() {
        return iTeamRepository.findAll();
    }

    @Override
    public void saveTeam(Team team) {
        iTeamRepository.save(team);
    }

    @Override
    public void deleteTeam(Long id) {
        iTeamRepository.deleteById(id);
    }

    @Override
    public Team findTeam(Long id) {
        return iTeamRepository.findById(id).orElse(null);
    }
}
