package com.cg.tournamentmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "player_id")
	private Long playerId;
	@Column(name = "player_name")
	private String playerName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "tournaments_played")
	private Integer tournamentsPlayed;
	@Column(name = "match_player")
	private Integer matchesPlayed;
	@Column(name = "matches_won")
	private Integer matchesWon;
	@Column(name = "matches_lost")
	private Integer matchesLost;
	@Column(name = "rank")
	private Integer rank;
	@Column(name = "total_score")
	private Integer totalScore;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(Long playerId, String playerName, String gender, Integer tournamentsPlayed, Integer matchesPlayed,
			Integer matchesWon, Integer matchesLost, Integer rank, Integer totalScore) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.gender = gender;
		this.tournamentsPlayed = Integer.valueOf(0);
		this.matchesPlayed =  Integer.valueOf(0);
		this.matchesWon =  Integer.valueOf(0);
		this.matchesLost =  Integer.valueOf(0);
		this.rank =  Integer.valueOf(0);
		this.totalScore =  Integer.valueOf(0);
	}

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getTournamentsPlayed() {
		return tournamentsPlayed;
	}

	public void setTournamentsPlayed(Integer tournamentsPlayed) {
		this.tournamentsPlayed = tournamentsPlayed;
	}

	public Integer getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(Integer matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public Integer getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(Integer matchesWon) {
		this.matchesWon = matchesWon;
	}

	public Integer getMatchesLost() {
		return matchesLost;
	}

	public void setMatchesLost(Integer matchesLost) {
		this.matchesLost = matchesLost;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}
	
	
	
	
	
}
