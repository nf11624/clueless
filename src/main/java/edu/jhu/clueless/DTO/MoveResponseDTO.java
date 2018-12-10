/**
 * 
 */
package edu.jhu.clueless.DTO;

/**
 * @author davidbess
 *
 */
public class MoveResponseDTO
{
  private String message;
  private boolean result;
  
  public MoveResponseDTO()
  {
    this.result = false;
  }
  
  public MoveResponseDTO(String message)
  {
    this.message = message;
    this.result = false;
  }
  
  /**
   * @return the result
   */
  public boolean getResult()
  {
    return result;
  }
  
  /**
   * @param result the result to set
   */
  public void setResult(boolean result)
  {
    this.result = result;
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
