/**
 * 
 */
package edu.jhu.clueless.domain;


import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author davidbess
 *
 */
public class Hallway extends Location
{

  public Hallway()
  {
    super();
    this.name = "Hallway";
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
  

  
  
}
