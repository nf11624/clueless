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
public class Room extends Location
{
  private String roomName;
  
  public Room()
  {
    super();
  }
  
  public Room(int[][] position)
  {
    super(position);
  }
  
  
  public Room(Set<Location> connectedLocation, Set<Player> occupyingPlayers,
      boolean isOccupied, int[][] position, String roomName)
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
    return "Location [connectedLocation=" + connectedLocation
        + ", occupyingPlayers=" + occupyingPlayers + ", isOccupied="
        + isOccupied + ", position=" + Arrays.toString(position) + ", "
            + "roomName=" + roomName + "]";
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((roomName == null) ? 0 : roomName.hashCode());
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
