package com.cnt.healthAPI.service;

import com.cnt.healthAPI.model.Team;
import java.util.List;

public interface ITeamService {

     List<Team> getTeam ();

     void saveTeam (Team team);

     void deleteTeam (Long id);

     Team findTeam (Long id);
}
