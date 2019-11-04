package com.cg.tournamentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.tournamentmanagement.dto.Player;

public interface PlayerRepository extends JpaRepository<Long, Player> {

}
