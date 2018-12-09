/**
 * 
 */
package edu.jhu.clueless.domain;

import java.util.Set;

/**
 * @author davidbess
 *
 */
public abstract class Location
{
  protected Set<Location> connectedLocation;
  protected Set<Player> occupyingPlayers;
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
  
  /**
   * 
   *  Constructor using arguments 
   *  
   * @param connectedLocation
   * @param occupyingPlayers
   * @param isOccupied
   * @param position
   */
  public Location(Set<Location> connectedLocation,
      Set<Player> occupyingPlayers, boolean isOccupied, Pair position)
  {
    super();
    this.connectedLocation = connectedLocation;
    this.occupyingPlayers = occupyingPlayers;
    this.isOccupied = isOccupied;
    this.position = position;
  }
  /**
   * @return the connectedLocation
   */
  public Set<Location> getConnectedLocation()
  {
    return connectedLocation;
  }
  /**
   * @param connectedLocation the connectedLocation to set
   */
  public void setConnectedLocation(Set<Location> connectedLocation)
  {
    this.connectedLocation = connectedLocation;
  }
  /**
   * @return the occupyingPlayers
   */
  public Set<Player> getOccupyingPlayers()
  {
    return occupyingPlayers;
  }
  /**
   * @param occupyingPlayers the occupyingPlayers to set
   */
  public void setOccupyingPlayers(Set<Player> occupyingPlayers)
  {
    this.occupyingPlayers = occupyingPlayers;
    for (Player p : occupyingPlayers) {
    	p.setLocation(this);
    }
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
    return "Location [connectedLocation=" + connectedLocation
        + ", occupyingPlayers=" + occupyingPlayers + ", isOccupied="
        + isOccupied + ", position=(" + position.getKey() + "," + position.getValue() + ")]";
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
        + ((connectedLocation == null) ? 0 : connectedLocation.hashCode());
    result = prime * result + (isOccupied ? 1231 : 1237);
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
    if (connectedLocation == null)
    {
      if (other.connectedLocation != null)
        return false;
    }
    else if (!connectedLocation.equals(other.connectedLocation))
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
    if (position.equals(other.position))
      return false;
    return true;
  }
  
  
  
}
