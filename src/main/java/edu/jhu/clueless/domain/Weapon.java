/**
 * 
 */
package edu.jhu.clueless.domain;

/**
 * @author davidbess
 *
 */
public class Weapon extends Card
{
  private String weaponName;

  /**
   * No arg constructor
   */
  public Weapon()
  {
    
  }
  
  /**
   * Constructor using parameters
   * 
   * @param weaponName
   */
  public Weapon(String weaponName)
  {
    super();
    this.weaponName = weaponName;
  }

  /**
   * @return the weaponName
   */
  public String getWeaponName()
  {
    return weaponName;
  }

  /**
   * @param weaponName the weaponName to set
   */
  public void setWeaponName(String weaponName)
  {
    this.weaponName = weaponName;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    return "Weapon [weaponName=" + weaponName + "]";
  }


  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Weapon other = (Weapon) obj;
    if (weaponName == null)
    {
      if (other.weaponName != null)
        return false;
    }
    else if (!weaponName.equals(other.weaponName))
      return false;
    return true;
  }

  
  
  
  
  
}
