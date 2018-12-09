package edu.jhu.clueless.DTO;

import java.util.LinkedList;
import java.util.List;

import edu.jhu.clueless.domain.Location;

public class LegalMovesDTO {
	private List<Location> legalMoves = new LinkedList<>();
	
	
	
	public List<Location> getLegalMoves() {
		return legalMoves;
	}
	
	public void addLegalMove(Location loc) {
		legalMoves.add(loc);
	}
	
	public void setLegalMoves(List<Location> legalMoves) {
		this.legalMoves = legalMoves;
	}
}
