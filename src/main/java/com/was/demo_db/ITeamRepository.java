package com.was.demo_db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeamRepository extends JpaRepository<Team,Long> {
    
}
