/**
 * 
 */
package edu.jhu.clueless.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author davidbess
 *
 */
//@JsonIdentityInfo(generator=ObjectIdGenerators.StringIdGenerator.class)
public abstract class Card
{
	@JsonProperty
	protected String name;
	@JsonProperty
	protected String location;
	
	public String getName() {
		return name;
	}
  
	public String getLocationString() {
		return location;
	}
}
