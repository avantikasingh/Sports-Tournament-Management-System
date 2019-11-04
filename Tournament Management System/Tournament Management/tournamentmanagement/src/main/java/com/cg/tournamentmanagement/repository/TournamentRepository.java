package com.cg.tournamentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.tournamentmanagement.dto.Tournament;

public interface TournamentRepository extends JpaRepository<Long, Tournament>{

}
