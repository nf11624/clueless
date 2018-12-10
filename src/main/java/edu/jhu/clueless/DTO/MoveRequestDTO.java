/**
 * 
 */
package edu.jhu.clueless.DTO;

/**
 * @author davidbess
 *
 */
public class MoveRequestDTO
{
  private int player;
  private int direction;
  public MoveRequestDTO()
  {
	  
  }
  
  /**
   * @return the player
  */
  public int getPlayer()
  {
	return player;
  }
  
  /**
   * @param player the player to set
   */
  public void setPlayer(int player)
  {
	this.player = player;
  }
  
  /**
   * @return the direction
   */
  public int getDirection()
  {
  	return direction;
  }
  
  /**
   * @param direction the direction to set
   */
  public void setDirection(int direction)
  {
  	this.direction = direction;
  }
}
