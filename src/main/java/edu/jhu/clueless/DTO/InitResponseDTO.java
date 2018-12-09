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
  
  private String statusMessage;
  private String missScarlet;
  private String profPlum;
  private String colMustard;
  private String mrsPeacock;
  private String mrGreen;
  
  public InitResponseDTO() {}

  public InitResponseDTO(String statusMessage)
  {
    this.statusMessage = statusMessage;
  }

  public InitResponseDTO(String statusMessage, String missScarlet,
      String profPlum, String colMustard, String mrsPeacock, String mrGreen)
  {
    this.statusMessage = statusMessage;
    this.missScarlet = missScarlet;
    this.profPlum = profPlum;
    this.colMustard = colMustard;
    this.mrsPeacock = mrsPeacock;
    this.mrGreen = mrGreen;
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
  public String getMissScarlet()
  {
    return missScarlet;
  }

  /**
   * @param missScarlet the missScarlet to set
   */
  public void setMissScarlet(String missScarlet)
  {
    this.missScarlet = missScarlet;
  }

  /**
   * @return the profPlum
   */
  public String getProfPlum()
  {
    return profPlum;
  }

  /**
   * @param profPlum the profPlum to set
   */
  public void setProfPlum(String profPlum)
  {
    this.profPlum = profPlum;
  }

  /**
   * @return the colMustard
   */
  public String getColMustard()
  {
    return colMustard;
  }

  /**
   * @param colMustard the colMustard to set
   */
  public void setColMustard(String colMustard)
  {
    this.colMustard = colMustard;
  }

  /**
   * @return the mrsPeacock
   */
  public String getMrsPeacock()
  {
    return mrsPeacock;
  }

  /**
   * @param mrsPeacock the mrsPeacock to set
   */
  public void setMrsPeacock(String mrsPeacock)
  {
    this.mrsPeacock = mrsPeacock;
  }

  /**
   * @return the mrGreen
   */
  public String getMrGreen()
  {
    return mrGreen;
  }

  /**
   * @param mrGreen the mrGreen to set
   */
  public void setMrGreen(String mrGreen)
  {
    this.mrGreen = mrGreen;
  }

  public String toString() {
	  return message;
  }
  
  
}
