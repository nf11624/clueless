/**
 * 
 */
package edu.jhu.clueless.DTO;

/**
 * @author davidbess
 *
 */
public class InitResponseDTO
{
  
  private String message;
  
  public InitResponseDTO() {}

  public InitResponseDTO(String message)
  {
    this.message = message;
  }

  /**
   * @return the message
   */
  public String getMessage()
  {
    return message;
  }

  /**
   * @param message the message to set
   */
  public void setMessage(String message)
  {
    this.message = message;
  }

  
  
}
