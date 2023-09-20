package com.was.demo_db;

import java.util.List;

public interface ITeamService {

    Team saveTeam(Team t);
    
    List<Team> getAllTeams();
    Team getTeam(long id);
    Team updateTeam(Team t);
     String deleteTeam (long id);
    



    
}
