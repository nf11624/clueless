/**
 * 
 */
package edu.jhu.clueless.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author davidbess
 *
 */
public class Player extends Card
{
  private String playerName;
  private Location location;
  
  @JsonBackReference
  private List<Card> playerCards;
  
  @JsonProperty
  private Set<CardDTO> playerCardsDTO = new HashSet<>();
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
    this.name = playerName;
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
    this.name = playerName;
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
    for (Card c : playerCards) {
    	playerCardsDTO.add(new CardDTO(c));
    }
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
	String cards = playerCards.stream().map( c -> c.getName()).collect( Collectors.joining( ", "));
			
    return "Player [playerName=" + playerName + ", location=" + location.name
        + ", playerCards=[" + cards + "]]";
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
        + ((playerCards == null) ? 0 : playerCards.size());
    result = prime * result
        + ((playerName == null) ? 0 : playerName.hashCode());
    result = prime * result;
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
  
 
  
private static class CardDTO {
	private String name;
	private String location;
	
	public CardDTO(Card c) {
		setName(c.getName());
		if (c instanceof Location) {
			setLocation(c.getName());
		}
		else {
			if (c.getLocationString() != null) {
				setLocation(c.getLocationString());
			}
		}
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		int locHash = 37;
		if (location != null) {
			locHash = location.hashCode();
		}
		return name.hashCode() + locHash;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean res = false;
		if (o instanceof CardDTO) {
			res = name.equals(((CardDTO)o).getName());
			if (location != null) {
				res = res && location.equals(((CardDTO)o).getLocation()); 
			}
		}
		return res;
	}
}
  
}
