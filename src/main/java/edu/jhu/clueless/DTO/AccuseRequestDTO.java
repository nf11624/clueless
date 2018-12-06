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
public class AccuseRequestDTO
{
  private Player accusingPlayer;
  private Player accusedPlayer;
  private Room murderScene;
  private Weapon murderWeapon;
  
  public AccuseRequestDTO() {}

  public AccuseRequestDTO(Player accusingPlayer, Player accusedPlayer,
      Room murderScene, Weapon murderWeapon)
  {
    this.accusingPlayer = accusingPlayer;
    this.accusedPlayer = accusedPlayer;
    this.murderScene = murderScene;
    this.murderWeapon = murderWeapon;
  }

  /**
   * @return the accusingPlayer
   */
  public Player getAccusingPlayer()
  {
    return accusingPlayer;
  }

  /**
   * @param accusingPlayer the accusingPlayer to set
   */
  public void setAccusingPlayer(Player accusingPlayer)
  {
    this.accusingPlayer = accusingPlayer;
  }

  /**
   * @return the accusedPlayer
   */
  public Player getAccusedPlayer()
  {
    return accusedPlayer;
  }

  /**
   * @param accusedPlayer the accusedPlayer to set
   */
  public void setAccusedPlayer(Player accusedPlayer)
  {
    this.accusedPlayer = accusedPlayer;
  }

  /**
   * @return the murderScene
   */
  public Room getMurderScene()
  {
    return murderScene;
  }

  /**
   * @param murderScene the murderScene to set
   */
  public void setMurderScene(Room murderScene)
  {
    this.murderScene = murderScene;
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
  };
  
  
  
  
  
}
