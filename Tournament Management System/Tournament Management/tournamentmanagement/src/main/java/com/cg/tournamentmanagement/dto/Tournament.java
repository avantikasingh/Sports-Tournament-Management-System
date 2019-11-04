package com.cg.tournamentmanagement.dto;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tournament {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tournament_id")
	private Long tournamentId;
	@Column(name = "tournament_name")
	private String tournamentName;
	@Column(name = "player_count")
	private Integer playerCount;
	@Column(name = "match_count")
	private Integer matchCount;
	@Column(name = "level_count")
	private Integer levelCount;
	@OneToMany
	private List<Player> playerList=new LinkedList<Player>();
	private Map<Player,Integer> scorecard=new HashMap<Player, Integer>();
	@OneToMany
	private List<Match> matchList=new LinkedList<Match>();
	
	public Tournament() {
		// TODO Auto-generated constructor stub
	}

	

	public Tournament(Long tournamentId, String tournamentName, Integer playerCount, Integer matchCount,
			Integer levelCount, List<Player> playerList, Map<Player, Integer> scorecard, List<Match> matchList) {
		super();
		this.tournamentId = tournamentId;
		this.tournamentName = tournamentName;
		this.playerCount = playerCount;
		this.matchCount = matchCount;
		this.levelCount = levelCount;
		this.playerList = playerList;
		this.scorecard = scorecard;
		this.matchList = matchList;
	}



	public Long getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(Long tournamentId) {
		this.tournamentId = tournamentId;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public Integer getPlayerCount() {
		return playerCount;
	}

	public void setPlayerCount(Integer playerCount) {
		this.playerCount = playerCount;
	}

	public Integer getMatchCount() {
		return matchCount;
	}

	public void setMatchCount(Integer matchCount) {
		this.matchCount = matchCount;
	}

	public Integer getLevelCount() {
		return levelCount;
	}

	public void setLevelCount(Integer levelCount) {
		this.levelCount = levelCount;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public Map<Player, Integer> getScorecard() {
		return scorecard;
	}

	public void setScorecard(Map<Player, Integer> scorecard) {
		this.scorecard = scorecard;
	}



	@Override
	public String toString() {
		return "Tournament [tournamentId=" + tournamentId + ", tournamentName=" + tournamentName + ", playerCount="
				+ playerCount + ", matchCount=" + matchCount + ", levelCount=" + levelCount + ", playerList="
				+ playerList + ", scorecard=" + scorecard + ", matchList=" + matchList + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((levelCount == null) ? 0 : levelCount.hashCode());
		result = prime * result + ((matchCount == null) ? 0 : matchCount.hashCode());
		result = prime * result + ((matchList == null) ? 0 : matchList.hashCode());
		result = prime * result + ((playerCount == null) ? 0 : playerCount.hashCode());
		result = prime * result + ((playerList == null) ? 0 : playerList.hashCode());
		result = prime * result + ((scorecard == null) ? 0 : scorecard.hashCode());
		result = prime * result + ((tournamentId == null) ? 0 : tournamentId.hashCode());
		result = prime * result + ((tournamentName == null) ? 0 : tournamentName.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tournament other = (Tournament) obj;
		if (levelCount == null) {
			if (other.levelCount != null)
				return false;
		} else if (!levelCount.equals(other.levelCount))
			return false;
		if (matchCount == null) {
			if (other.matchCount != null)
				return false;
		} else if (!matchCount.equals(other.matchCount))
			return false;
		if (matchList == null) {
			if (other.matchList != null)
				return false;
		} else if (!matchList.equals(other.matchList))
			return false;
		if (playerCount == null) {
			if (other.playerCount != null)
				return false;
		} else if (!playerCount.equals(other.playerCount))
			return false;
		if (playerList == null) {
			if (other.playerList != null)
				return false;
		} else if (!playerList.equals(other.playerList))
			return false;
		if (scorecard == null) {
			if (other.scorecard != null)
				return false;
		} else if (!scorecard.equals(other.scorecard))
			return false;
		if (tournamentId == null) {
			if (other.tournamentId != null)
				return false;
		} else if (!tournamentId.equals(other.tournamentId))
			return false;
		if (tournamentName == null) {
			if (other.tournamentName != null)
				return false;
		} else if (!tournamentName.equals(other.tournamentName))
			return false;
		return true;
	}

	
	
	
}
