/**
 * 
 */
package edu.jhu.clueless.domain;

import java.util.LinkedList;
import java.util.List;

/**
 * @author davidbess
 *
 */
public class Player extends Card
{
  private String playerName;
  private Location location;
  private List<Card> playerCards; 
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
  public Player(String playerName, List<Card> playerCards)
  {
    super();
    this.playerName = playerName;
    this.playerCards = playerCards;
  }
  
  



  public Player(String playerName, Location location,
      List<Card> playerCards)
  {
    this.playerName = playerName;
    this.location = location;
    this.playerCards = playerCards;
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

  /**
   * @return the playerCards
   */
  public List<Card> getPlayerCards()
  {
    return playerCards;
  }

  /**
   * @param playerCards the playerCards to set
   */
  public void setPlayerCards(List<Card> playerCards)
  {
    this.playerCards = playerCards;
  }



  public Location getLocation() {
	  return location;
  }
  
  public void setLocation(Location location) {
	  this.location = location;
  }



  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "Player [playerName=" + playerName + ", location=" + location
        + ", playerCards=" + playerCards + "]";
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
        + ((playerCards == null) ? 0 : playerCards.hashCode());
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
    if (location == null)
    {
      if (other.location != null)
        return false;
    }
    else if (!location.equals(other.location))
      return false;
    if (playerCards == null)
    {
      if (other.playerCards != null)
        return false;
    }
    else if (!playerCards.equals(other.playerCards))
      return false;
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
