/**
 * 
 */
package edu.jhu.clueless.domain;

import java.util.Arrays;
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

  public Hallway(Set<Location> connectedLocation,
      Set<Player> occupyingPlayers, boolean isOccupied, int[][] position)
  {
    super(connectedLocation, occupyingPlayers, isOccupied, position);
  }
  
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "Location [connectedLocation=" + connectedLocation
        + ", occupyingPlayers=" + occupyingPlayers + ", isOccupied="
        + isOccupied + ", position=" + Arrays.toString(position) + "]";
  }
  
  
}
