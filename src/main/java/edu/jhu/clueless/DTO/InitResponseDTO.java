/**
 * 
 */
package edu.jhu.clueless.DTO;

import edu.jhu.clueless.domain.Player;

/**
 * @author davidbess
 *
 */
public class InitResponseDTO
{
  
  private String statusMessage;
  private Player missScarlet;
  private Player profPlum;
  private Player colMustard;
  private Player mrsPeacock;
  private Player mrGreen;
  private Player mrsWhite;
  
  public InitResponseDTO() {}

  public InitResponseDTO(String statusMessage)
  {
    this.statusMessage = statusMessage;
  }

  public InitResponseDTO(String statusMessage, Player missScarlet,
      Player profPlum, Player colMustard, Player mrsPeacock, Player mrGreen, Player mrsWhite)
  {
    this.statusMessage = statusMessage;
    this.missScarlet = missScarlet;
    this.profPlum = profPlum;
    this.colMustard = colMustard;
    this.mrsPeacock = mrsPeacock;
    this.mrGreen = mrGreen;
    this.mrsWhite = mrsWhite;
  }

  /**
   * @return the statusMessage
   */
  public String getStatusMessage()
  {
    return statusMessage;
  }

  /**
   * @param statusMessage the statusMessage to set
   */
  public void setStatusMessage(String statusMessage)
  {
    this.statusMessage = statusMessage;
  }

  /**
   * @return the missScarlet
   */
  public Player getMissScarlet()
  {
    return missScarlet;
  }

  /**
   * @param missScarlet the missScarlet to set
   */
  public void setMissScarlet(Player missScarlet)
  {
    this.missScarlet = missScarlet;
  }

  /**
   * @return the profPlum
   */
  public Player getProfPlum()
  {
    return profPlum;
  }

  /**
   * @param profPlum the profPlum to set
   */
  public void setProfPlum(Player profPlum)
  {
    this.profPlum = profPlum;
  }

  /**
   * @return the colMustard
   */
  public Player getColMustard()
  {
    return colMustard;
  }


  /**
   * @param colMustard the colMustard to set
   */
  public void setColMustard(Player colMustard)
  {
    this.colMustard = colMustard;
  }

  /**
   * @return the mrsPeacock
   */
  public Player getMrsPeacock()
  {
    return mrsPeacock;
  }

  /**
   * @param mrsPeacock the mrsPeacock to set
   */
  public void setMrsPeacock(Player mrsPeacock)
  {
    this.mrsPeacock = mrsPeacock;
  }

  /**
   * @return the mrGreen
   */
  public Player getMrGreen()
  {
    return mrGreen;
  }

  /**
   * @param mrGreen the mrGreen to set
   */
  public void setMrGreen(Player mrGreen)
  {
    this.mrGreen = mrGreen;
  }

  public String String() {
	  return statusMessage;
  }
  
  public void setMrsWhite(Player mrsWhite) {
	  this.mrsWhite = mrsWhite;
  }
  
  public Player getMrsWhite() { 
	  return mrsWhite;
  }
  
  
}
