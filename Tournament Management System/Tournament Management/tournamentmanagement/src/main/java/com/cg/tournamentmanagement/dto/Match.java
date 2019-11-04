package com.cg.tournamentmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "match_Id")
	private Long matchId;
	@OneToOne
	@Column(name = "player1")
	private Player playerOne;
	@OneToOne
	@Column(name = "player2")
	private Player playerTwo;
	@Column(name = "level")
	private Integer level;
	@Column(name = "player1_score")
	private Integer playerOneScore;
	@Column(name = "player2_score")
	private Integer playerTwoScore;
	@Column(name = "winner")
	private Player matchWinner;
	
	public Match() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Match(Long matchId, Player playerOne, Player playerTwo, Integer level, Integer playerOneScore,
			Integer playerTwoScore, Player matchWinner) {
		super();
		this.matchId = matchId;
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		this.level = level;
		this.playerOneScore = playerOneScore;
		this.playerTwoScore = playerTwoScore;
		this.matchWinner = matchWinner;
	}



	public Long getMatchId() {
		return matchId;
	}

	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}

	public Player getPlayerOne() {
		return playerOne;
	}

	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}

	public Player getPlayerTwo() {
		return playerTwo;
	}

	public void setPlayerTwo(Player playerTwo) {
		this.playerTwo = playerTwo;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getPlayerOneScore() {
		return playerOneScore;
	}

	public void setPlayerOneScore(Integer playerOneScore) {
		this.playerOneScore = playerOneScore;
	}

	public Integer getPlayerTwoScore() {
		return playerTwoScore;
	}

	public void setPlayerTwoScore(Integer playerTwoScore) {
		this.playerTwoScore = playerTwoScore;
	}

	public Player getMatchWinner() {
		return matchWinner;
	}

	public void setMatchWinner(Player matchWinner) {
		this.matchWinner = matchWinner;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", playerOne=" + playerOne + ", playerTwo=" + playerTwo + ", level="
				+ level + ", playerOneScore=" + playerOneScore + ", playerTwoScore=" + playerTwoScore + ", matchWinner="
				+ matchWinner + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + ((matchId == null) ? 0 : matchId.hashCode());
		result = prime * result + ((matchWinner == null) ? 0 : matchWinner.hashCode());
		result = prime * result + ((playerOne == null) ? 0 : playerOne.hashCode());
		result = prime * result + ((playerOneScore == null) ? 0 : playerOneScore.hashCode());
		result = prime * result + ((playerTwo == null) ? 0 : playerTwo.hashCode());
		result = prime * result + ((playerTwoScore == null) ? 0 : playerTwoScore.hashCode());
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
		Match other = (Match) obj;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		if (matchId == null) {
			if (other.matchId != null)
				return false;
		} else if (!matchId.equals(other.matchId))
			return false;
		if (matchWinner == null) {
			if (other.matchWinner != null)
				return false;
		} else if (!matchWinner.equals(other.matchWinner))
			return false;
		if (playerOne == null) {
			if (other.playerOne != null)
				return false;
		} else if (!playerOne.equals(other.playerOne))
			return false;
		if (playerOneScore == null) {
			if (other.playerOneScore != null)
				return false;
		} else if (!playerOneScore.equals(other.playerOneScore))
			return false;
		if (playerTwo == null) {
			if (other.playerTwo != null)
				return false;
		} else if (!playerTwo.equals(other.playerTwo))
			return false;
		if (playerTwoScore == null) {
			if (other.playerTwoScore != null)
				return false;
		} else if (!playerTwoScore.equals(other.playerTwoScore))
			return false;
		return true;
	}
	
	

}
