/**
 * 
 */
package edu.jhu.clueless.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author davidbess
 *
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.StringIdGenerator.class)
public abstract class Card
{
	@JsonTypeId
	protected String name;
	
	public String getName() {
		return name;
	}
  
}
