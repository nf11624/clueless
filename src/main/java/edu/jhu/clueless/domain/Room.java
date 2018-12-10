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
public class Room extends Location
{
  private String roomName;
  
  public Room()
  {
    super();
  }
  
  public Room(Pair position)
  {
    super(position);
  }
  
  public Room(String roomName)
  {
    this.roomName = roomName;
  }
  
  
  public Room(LinkedList<Location> connectedLocation, LinkedList<Player> occupyingPlayers,
      boolean isOccupied, Pair position, String roomName)
  {
    super(connectedLocation, occupyingPlayers, isOccupied, position);
    this.roomName = roomName;
  }
  
  /**
   * @return the roomName
   */
  public String getRoomName()
  {
    return roomName;
  }
  /**
   * @param roomName the roomName to set
   */
  public void setRoomName(String roomName)
  {
    this.roomName = roomName;
  }

  
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "Location [connectedLocation=" + connectedLocations
        + ", occupyingPlayers=" + occupyingPlayers + ", isOccupied="
        + isOccupied + ", position=" + position + ", "
            + "roomName=" + roomName + "]";
  }



  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    Room other = (Room) obj;
    if (roomName == null)
    {
      if (other.roomName != null)
        return false;
    }
    else if (!roomName.equals(other.roomName))
      return false;
    return true;
  }
  
  
  
  
}
