/**
 * 
 */
package edu.jhu.clueless.domain;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author davidbess
 *
 */
public abstract class Location extends Card
{

	@JsonIgnore
	protected Set<Location> connectedLocations = new HashSet<>();
	@JsonIgnore
	protected List<Player> occupyingPlayers = new LinkedList<>();
	protected boolean occupied = false;

	/*
	 * 5 by 5 grid.  rows with rooms are full, 
	 * rows with only hallway have some sparsity. 
	 */
	@JsonIgnore
	protected Pair position; 

	/**
	 * No arg constructor
	 */
	public Location() 
	{

	};

	public Location(Pair position) 
	{
		this.position = position;
	};


	/**
	 * 
	 *  Constructor using arguments 
	 *  
	 * @param connectedLocation
	 * @param occupyingPlayers
	 * @param isOccupied
	 * @param position
	 */

	public Location(Set<Location> connectedLocations,
			List<Player> occupyingPlayers, boolean isOccupied, Pair position)
	{
		super();
		this.connectedLocations = connectedLocations;
		this.occupyingPlayers = occupyingPlayers;
		this.position = position;
	}

	/**
	 * @return the connectedLocation
	 */
	public Set<Location> getConnectedLocations()
	{
		return connectedLocations;
	}

	/**
	 * @param connectedLocation the connectedLocation to set
	 */
	public void setConnectedLocation(Set<Location> connectedLocations)
	{
		this.connectedLocations = connectedLocations;
	}

	/**
	 * @return the occupyingPlayers
	 */
	public List<Player> getOccupyingPlayers()
	{
		return occupyingPlayers;
	}

	/**
	 * @param occupyingPlayers the occupyingPlayers to set
	 */
	public void setOccupyingPlayers(List<Player> occupyingPlayers)
	{
		this.occupyingPlayers = occupyingPlayers;
		for (Player p : occupyingPlayers) {
			p.setLocation(this);
		}
	}

	/**
	 * @param occupyingPlayer the occupyingPlayer to remove
	 */
	public void removeOccupyingPlayer(Player occupyingPlayer)
	{
		occupyingPlayers.remove(occupyingPlayer);
	}

	/**
	 * @param occupyingPlayer the occupyingPlayer to add
	 */
	public void addOccupyingPlayer(Player occupyingPlayer)
	{
		if (occupyingPlayer.getLocation() != null) {
			occupyingPlayer.getLocation().removeOccupyingPlayer(occupyingPlayer);
		}
		occupyingPlayers.add(occupyingPlayer);
		occupyingPlayer.setLocation(this);
	}

	/**
	 * @return the isOccupied
	 */
	public boolean isOccupied()
	{
		return !occupyingPlayers.isEmpty();
	}

	public void addConnectedLocation(Location loc) {
		this.connectedLocations.add(loc);
		loc.connectedLocations.add(this);
	}
	
	/**
	 * @return the position
	 */
	public Pair getPosition()
	{
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Pair position)
	{
		this.position = position;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		String connections = connectedLocations.stream().map( l -> l.name).collect( Collectors.joining( ", "));
		String players = occupyingPlayers.stream().map( l -> l.getPlayerName()).collect( Collectors.joining( ", "));

		return "Location [" + name + "] :: [connectedLocation=[" + connections
				+ "], occupyingPlayers=[" + players + "], isOccupied="
				+ occupied + ", position=" + position + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((connectedLocations == null) ? 0 : connectedLocations.size());
		result = prime * result + (occupied ? 1231 : 1237);
		result = prime * result
				+ ((occupyingPlayers == null) ? 0 : occupyingPlayers.hashCode());
		result = prime * result + position.hashCode();
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		if (connectedLocations == null)
		{
			if (other.connectedLocations != null)
				return false;
		}
		else if (!connectedLocations.equals(other.connectedLocations))
			return false;
		if (occupied != other.occupied)
			return false;
		if (occupyingPlayers == null)
		{
			if (other.occupyingPlayers != null)
				return false;
		}
		else if (!occupyingPlayers.equals(other.occupyingPlayers))
			return false;

		if (position == null)
		{
			if (other.position != null)
				return false;
		}
		else if (!position.equals(other.position))
			return false;
		return true;
	}







}
