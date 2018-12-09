/**
 * 
 */
package edu.jhu.clueless.domain;

/**
 * @author davidbess
 *
 */
public class ConfidentialFile
{
  private Room murderLocation;
  private Player murderingPlayer;
  private Weapon murderWeapon;
  
  
  public ConfidentialFile() {};
  
  public ConfidentialFile(Room murderLocation, Player murderingPlayer,
      Weapon murderWeapon)
  {
    this.murderLocation = murderLocation;
    this.murderingPlayer = murderingPlayer;
    this.murderWeapon = murderWeapon;
  }
  /**
   * @return the murderLocation
   */
  public Room getMurderLocation()
  {
    return murderLocation;
  }
  /**
   * @param murderLocation the murderLocation to set
   */
  public void setMurderLocation(Room murderLocation)
  {
    this.murderLocation = murderLocation;
  }
  /**
   * @return the murderingPlayer
   */
  public Player getMurderingPlayer()
  {
    return murderingPlayer;
  }
  /**
   * @param murderingPlayer the murderingPlayer to set
   */
  public void setMurderingPlayer(Player murderingPlayer)
  {
    this.murderingPlayer = murderingPlayer;
  }
  /**
   * @return the murderWeapon
   */
  public Weapon getMurderWeapon()
  {
    return murderWeapon;
  }
  /**
   * @param murderWeapon the murderWeapon to set
   */
  public void setMurderWeapon(Weapon murderWeapon)
  {
    this.murderWeapon = murderWeapon;
  }
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "ConfidentialFile [murderLocation=" + murderLocation
        + ", murderingPlayer=" + murderingPlayer + ", murderWeapon="
        + murderWeapon + "]";
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
        + ((murderLocation == null) ? 0 : murderLocation.hashCode());
    result = prime * result
        + ((murderWeapon == null) ? 0 : murderWeapon.hashCode());
    result = prime * result
        + ((murderingPlayer == null) ? 0 : murderingPlayer.hashCode());
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
    ConfidentialFile other = (ConfidentialFile) obj;
    if (murderLocation == null)
    {
      if (other.murderLocation != null)
        return false;
    }
    else if (!murderLocation.equals(other.murderLocation))
      return false;
    if (murderWeapon == null)
    {
      if (other.murderWeapon != null)
        return false;
    }
    else if (!murderWeapon.equals(other.murderWeapon))
      return false;
    if (murderingPlayer == null)
    {
      if (other.murderingPlayer != null)
        return false;
    }
    else if (!murderingPlayer.equals(other.murderingPlayer))
      return false;
    return true;
  }
  
  
  
}
