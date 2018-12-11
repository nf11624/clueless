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
  private boolean correct;
  private String message;
  
  public AccuseResponseDTO() {}

  public AccuseResponseDTO(boolean isTrue, String message)
  {
    this.correct = isTrue;
    this.message = message;
  }

  /**
   * @return the isTrue
   */
  public boolean isCorrect()
  {
    return correct;
  }

  /**
   * @param isTrue the isTrue to set
   */
  public void setCorrect(boolean isTrue)
  {
    this.correct = isTrue;
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
