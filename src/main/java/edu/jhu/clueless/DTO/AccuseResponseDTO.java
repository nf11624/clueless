/**
 * 
 */
package edu.jhu.clueless.DTO;

/**
 * @author davidbess
 *
 */
public class AccuseResponseDTO
{
  private boolean isTrue;
  private String message;
  
  public AccuseResponseDTO() {}

  public AccuseResponseDTO(boolean isTrue, String message)
  {
    this.isTrue = isTrue;
    this.message = message;
  }

  /**
   * @return the isTrue
   */
  public boolean isTrue()
  {
    return isTrue;
  }

  /**
   * @param isTrue the isTrue to set
   */
  public void setTrue(boolean isTrue)
  {
    this.isTrue = isTrue;
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
  };
  
  
  
  
}
