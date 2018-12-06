/**
 * 
 */
package edu.jhu.clueless.DTO;

/**
 * @author davidbess
 *
 */
public class InitRequestDTO
{
  
  private String gameName;
  
  public InitRequestDTO() {};

  public InitRequestDTO(String gameName)
  {
    this.gameName = gameName;
  }

  /**
   * @return the gameName
   */
  public String getGameName()
  {
    return gameName;
  }

  /**
   * @param gameName the gameName to set
   */
  public void setGameName(String gameName)
  {
    this.gameName = gameName;
  }
  
  
  
}
