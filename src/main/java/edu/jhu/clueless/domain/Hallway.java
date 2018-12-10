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
public class Hallway extends Location
{

  public Hallway()
  {
    super();
  }
  
  public Hallway(Pair position)
  {
    super(position);
  }

  public Hallway(LinkedList<Location> connectedLocation,
      LinkedList<Player> occupyingPlayers, boolean isOccupied, Pair position)
  {
    super(connectedLocation, occupyingPlayers, isOccupied, position);
  }
  
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "Location [connectedLocation=" + connectedLocations
        + ", occupyingPlayers=" + occupyingPlayers + ", isOccupied="
        + isOccupied + ", position=" + position.toString() + "]";
  }
  
  
}
