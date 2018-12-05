/**
 * 
 */
package edu.jhu.clueless.domain;

/**
 * @author davidbess
 *
 */
public class Player
{
  private String playerName;

  /**
   * No arg constructor
   */
  public Player()
  {
    
  };
  
  /**
   * Constructor using arguments
   * 
   * @param playerName
   */
  public Player(String playerName)
  {
    super();
    this.playerName = playerName;
  }

  /**
   * @return the playerName
   */
  public String getPlayerName()
  {
    return playerName;
  }

  /**
   * @param playerName the playerName to set
   */
  public void setPlayerName(String playerName)
  {
    this.playerName = playerName;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "Player [playerName=" + playerName + "]";
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
        + ((playerName == null) ? 0 : playerName.hashCode());
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
    Player other = (Player) obj;
    if (playerName == null)
    {
      if (other.playerName != null)
        return false;
    }
    else if (!playerName.equals(other.playerName))
      return false;
    return true;
  }
  
  
  
}
