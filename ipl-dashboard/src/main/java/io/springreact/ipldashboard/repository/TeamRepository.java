package io.springreact.ipldashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.springreact.ipldashboard.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

    Team findByTeamName(String teamName);
}
