/**
 * 
 */
package edu.jhu.clueless.DTO;

/**
 * @author davidbess
 *
 */
public class SuggestResponseDTO
{
  private String result;
  private String cardRevealMessage;
  
  public SuggestResponseDTO() {};
  
  public SuggestResponseDTO(String result, String cardRevealMessage)
  {
    this.result = result;
    this.cardRevealMessage = cardRevealMessage;
  }
  /**
   * @return the result
   */
  public String getResult()
  {
    return result;
  }
  /**
   * @param result the result to set
   */
  public void setResult(String result)
  {
    this.result = result;
  }
  /**
   * @return the cardRevealMessage
   */
  public String getCardRevealMessage()
  {
    return cardRevealMessage;
  }
  /**
   * @param cardRevealMessage the cardRevealMessage to set
   */
  public void setCardRevealMessage(String cardRevealMessage)
  {
    this.cardRevealMessage = cardRevealMessage;
  }
  
  
  
}
