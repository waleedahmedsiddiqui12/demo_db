package com.was.demo_db;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TeamRepository implements ITeamService{


    // Dependency START
    private ITeamRepository iTeamRepository;

    public TeamRepository(ITeamRepository iTeamRepository)
    {
        this.iTeamRepository=iTeamRepository;
    }
    // END

    @Override
    public Team saveTeam(Team t) {
        
      return iTeamRepository.save(t);
    }

    @Override
    public List<Team> getAllTeams() {
       
        return iTeamRepository.findAll();
    }

    @Override
    public Team getTeam(long id) {
       return iTeamRepository.getReferenceById(id);
    }

    @Override
    public Team updateTeam(Team t) {
       
        return iTeamRepository.save(t);
    }

    @Override
    public String deleteTeam(long id) {

        iTeamRepository.deleteById(id);
        return "Deleted";
      
    }

    
}
