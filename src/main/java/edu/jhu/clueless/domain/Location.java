/**
 * 
 */
package edu.jhu.clueless.domain;

import java.util.LinkedList;
import java.util.Set;

/**
 * @author davidbess
 *
 */
public abstract class Location extends Card
{
  protected LinkedList<Location> connectedLocations;
  protected LinkedList<Player> occupyingPlayers;
  protected boolean isOccupied;
  
  /*
   * 5 by 5 grid.  rows with rooms are full, 
   * rows with only hallway have some sparsity. 
   */
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
  

  
  public Location(LinkedList<Location> connectedLocations,
      LinkedList<Player> occupyingPlayers, boolean isOccupied, Pair position)
  {
    super();
    this.connectedLocations = connectedLocations;
    this.occupyingPlayers = occupyingPlayers;
    this.isOccupied = isOccupied;
    this.position = position;
  }

  /**
   * @return the connectedLocation
   */
  public LinkedList<Location> getConnectedLocations()
  {
    return connectedLocations;
  }

  /**
   * @param connectedLocation the connectedLocation to set
   */
  public void setConnectedLocation(LinkedList<Location> connectedLocations)
  {
    this.connectedLocations = connectedLocations;
  }

  /**
   * @return the occupyingPlayers
   */
  public LinkedList<Player> getOccupyingPlayers()
  {
    return occupyingPlayers;
  }

  /**
   * @param occupyingPlayers the occupyingPlayers to set
   */
  public void setOccupyingPlayers(LinkedList<Player> occupyingPlayers)
  {
    this.occupyingPlayers = occupyingPlayers;
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
    occupyingPlayers.add(occupyingPlayer);
  }

  /**
   * @return the isOccupied
   */
  public boolean isOccupied()
  {
    return isOccupied;
  }

  /**
   * @param isOccupied the isOccupied to set
   */
  public void setOccupied(boolean isOccupied)
  {
    this.isOccupied = isOccupied;
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
    return "Location [connectedLocation=" + connectedLocations
        + ", occupyingPlayers=" + occupyingPlayers + ", isOccupied="
        + isOccupied + ", position=" + position + "]";
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
    if (isOccupied != other.isOccupied)
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
