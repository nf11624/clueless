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
public class Player extends Card
{
  private String playerName;
  private Location location;
  private LinkedList<Card> playerCards; 
  /**
   * No arg constructor
   */
  public Player()
  {
    
  };
  
  /**
   * 
   * @param playerName
   */
  public Player(String playerName)
  {
    this.playerName = playerName;
  }
  
  
  /**
   * Constructor using arguments
   * 
   * @param playerName
   */
  public Player(String playerName, LinkedList<Card> playerCards)
  {
    super();
    this.playerName = playerName;
    this.playerCards = playerCards;
  }
  


  public Player(String playerName, Location location,
      LinkedList<Card> playerCards)
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
  public LinkedList<Card> getPlayerCards()
  {
    return playerCards;
  }



  /**
   * @param playerCards the playerCards to set
   */
  public void setPlayerCards(LinkedList<Card> playerCards)
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
