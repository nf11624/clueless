package edu.jhu.clueless.domain;

import java.util.Map.Entry;

public class Pair implements Entry<Integer, Integer> {
	
	public Integer x;
	public Integer y;
	
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
<<<<<<< HEAD
	public Integer getX() {
		return x;
	}
	
	public Integer getY() {
		return y;
	}

	@Override
	public Integer getKey() {
		// TODO Auto-generated method stub
		return getX();
	}

	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return getY();
=======
	public Integer getRow() {
		return x;
	}
	
	public Integer getColumn() {
		return y;
	}

	@Override
	public Integer getKey() {
		// TODO Auto-generated method stub
		return getRow();
	}

	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return getColumn();
>>>>>>> refs/remotes/bess/master
	}

	@Override
	public Integer setValue(Integer value) {
		// TODO Auto-generated method stub
		this.y = value;
		return y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
}
