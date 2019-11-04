package com.cg.tournamentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.tournamentmanagement.dto.Match;

public interface MatchRepository extends JpaRepository<Long, Match> {

}
