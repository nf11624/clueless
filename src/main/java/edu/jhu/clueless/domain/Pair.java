package edu.jhu.clueless.domain;

import java.util.Map.Entry;

public class Pair implements Entry<Integer, Integer> {
	
	public Integer x;
	public Integer y;
	
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public Integer getX() {
		return x;
	}
	
	public Integer getY() {
		return y;
	}

	public Integer getRow() {
		return x;
	}
	
	public Integer getColumn() {
		return y;
	}

	@Override
	public Integer getKey() {
		return getRow();
	}

	@Override
	public Integer getValue() {
		return getColumn();
	}

	@Override
	public Integer setValue(Integer value) {
		this.y = value;
		return y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
}
