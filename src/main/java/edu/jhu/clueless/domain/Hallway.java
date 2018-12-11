/**
 * 
 */
package edu.jhu.clueless.domain;


import java.util.List;
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
    this.name = "Hallway";
  }
  
  public Hallway(Pair position)
  {
    super(position);
  }
  
  public Hallway(String name, Pair position) {
	  this.name = name;
	  this.position = position;
	  this.occupied = false;
	  this.location = name;
  }

  public Hallway(Set<Location> connectedLocation,
      List<Player> occupyingPlayers, boolean isOccupied, Pair position)
  {
    super(connectedLocation, occupyingPlayers, isOccupied, position);
  }
  

  
  
}
