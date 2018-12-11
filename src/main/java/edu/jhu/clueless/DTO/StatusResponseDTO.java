package edu.jhu.clueless.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import edu.jhu.clueless.domain.Card;
import edu.jhu.clueless.domain.Player;

public class StatusResponseDTO {
	@JsonProperty
	private List<Card> weapons;
	@JsonProperty
	private List<Player> players;
	@JsonProperty
	private Player currentPlayer;
	
	public void setWeapons(List<Card> weapons) {
		this.weapons = weapons;
	}
	
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	public void setCurrentPlayer(Player player) {
		this.currentPlayer = player;
	}
	
	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	
	public List<Card> getWeapons(){
		return weapons;
	}
	
	public List<Player> players() {
		return players;
	}
}
