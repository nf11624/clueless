/**
 * 
 */
package edu.jhu.clueless.DTO;

import edu.jhu.clueless.domain.Player;
import edu.jhu.clueless.domain.Room;
import edu.jhu.clueless.domain.Weapon;

/**
 * @author davidbess
 *
 */
public class SuggestRequestDTO
{
  String suggestedPlayerName;
  String suggestedWeaponName;
  String suggestedRoomName;
  
  public SuggestRequestDTO() {}

  public SuggestRequestDTO(String suggestedPlayerName,
      String suggestedWeaponName, String suggestedRoomName)
  {
    this.suggestedPlayerName = suggestedPlayerName;
    this.suggestedWeaponName = suggestedWeaponName;
    this.suggestedRoomName = suggestedRoomName;
  }

  /**
   * @return the suggestedPlayerName
   */
  public String getSuggestedPlayerName()
  {
    return suggestedPlayerName;
  }

  /**
   * @param suggestedPlayerName the suggestedPlayerName to set
   */
  public void setSuggestedPlayerName(String suggestedPlayerName)
  {
    this.suggestedPlayerName = suggestedPlayerName;
  }

  /**
   * @return the suggestedWeaponName
   */
  public String getSuggestedWeaponName()
  {
    return suggestedWeaponName;
  }

  /**
   * @param suggestedWeaponName the suggestedWeaponName to set
   */
  public void setSuggestedWeaponName(String suggestedWeaponName)
  {
    this.suggestedWeaponName = suggestedWeaponName;
  }

  /**
   * @return the suggestedRoomName
   */
  public String getSuggestedRoomName()
  {
    return suggestedRoomName;
  }

  /**
   * @param suggestedRoomName the suggestedRoomName to set
   */
  public void setSuggestedRoomName(String suggestedRoomName)
  {
    this.suggestedRoomName = suggestedRoomName;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "SuggestRequestDTO [suggestedPlayerName=" + suggestedPlayerName
        + ", suggestedWeaponName=" + suggestedWeaponName
        + ", suggestedRoomName=" + suggestedRoomName + "]";
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((suggestedPlayerName == null) ? 0
        : suggestedPlayerName.hashCode());
    result = prime * result
        + ((suggestedRoomName == null) ? 0 : suggestedRoomName.hashCode());
    result = prime * result + ((suggestedWeaponName == null) ? 0
        : suggestedWeaponName.hashCode());
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
    SuggestRequestDTO other = (SuggestRequestDTO) obj;
    if (suggestedPlayerName == null)
    {
      if (other.suggestedPlayerName != null)
        return false;
    }
    else if (!suggestedPlayerName.equals(other.suggestedPlayerName))
      return false;
    if (suggestedRoomName == null)
    {
      if (other.suggestedRoomName != null)
        return false;
    }
    else if (!suggestedRoomName.equals(other.suggestedRoomName))
      return false;
    if (suggestedWeaponName == null)
    {
      if (other.suggestedWeaponName != null)
        return false;
    }
    else if (!suggestedWeaponName.equals(other.suggestedWeaponName))
      return false;
    return true;
  };
  

  
  
  
  
}
