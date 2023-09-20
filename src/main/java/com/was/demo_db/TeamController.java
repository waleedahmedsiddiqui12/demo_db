package com.was.demo_db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teams")
public class TeamController {
    

//     private TeamRepository teamRepository;
//     private ITeamRepository iTeamRepository;

//    public TeamController()
//    {
//       teamRepository =new TeamRepository(iTeamRepository);
//    }

@Autowired
private ITeamRepository teamRepository;

    @GetMapping("")
    public List<Team> ViewTeams()
    {
        return teamRepository.findAll();
    }

    @GetMapping("/{id}")
    public Team ViewSingleTeam(@PathVariable long id)
    {
        return teamRepository.getReferenceById(id);
    }

    @PostMapping("add")
    public Team AddTeam(@RequestBody Team t)
    {
        return teamRepository.save(t);
    }

    @PostMapping("Update")
    public Team UpdateTeam(@RequestBody Team t)
    {
        return teamRepository.save(t);
    }

    @PostMapping("delete/{id}")
    public String DeleteTeam(@PathVariable Long t)
    {
         teamRepository.deleteById(t);
         return "Item Deleted";
    }

}
