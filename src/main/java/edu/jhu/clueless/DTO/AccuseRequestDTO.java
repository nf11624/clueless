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
  private int accusingPlayer;
  private int accusedPlayer;
//  private String murderScene;
  private String murderWeapon;
  
  public AccuseRequestDTO() {}

  public AccuseRequestDTO(Integer currentPlayer, Integer targetPlayer,
      String weapon)
  {
    this.accusingPlayer = currentPlayer;
    this.accusedPlayer = targetPlayer;
    this.murderWeapon = weapon;
  }

  /**
   * @return the accusingPlayer
   */
  public int getAccusingPlayer()
  {
    return accusingPlayer;
  }

  /**
   * @param accusingPlayer the accusingPlayer to set
   */
  public void setAccusingPlayer(int accusingPlayer)
  {
    this.accusingPlayer = accusingPlayer;
  }

  /**
   * @return the accusedPlayer
   */
  public int getAccusedPlayer()
  {
    return accusedPlayer;
  }

  /**
   * @param accusedPlayer the accusedPlayer to set
   */
  public void setAccusedPlayer(Integer accusedPlayer)
  {
    this.accusedPlayer = accusedPlayer;
  }

//  /**
//   * @return the murderScene
//   */
//  public Room getMurderScene()
//  {
//    return murderScene;
//  }
//
//  /**
//   * @param murderScene the murderScene to set
//   */
//  public void setMurderScene(Room murderScene)
//  {
//    this.murderScene = murderScene;
//  }

  /**
   * @return the murderWeapon
   */
  public String getMurderWeapon()
  {
    return murderWeapon;
  }

  /**
   * @param murderWeapon the murderWeapon to set
   */
  public void setMurderWeapon(String murderWeapon)
  {
    this.murderWeapon = murderWeapon;
  };
  
  
  
  
  
}
