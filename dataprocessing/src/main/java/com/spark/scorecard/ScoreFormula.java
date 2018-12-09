package com.spark.scorecard;

import java.io.Serializable;

public class ScoreFormula implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String key;
	private double value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "ScoreFormula [key=" + key + ", value=" + value + "]";
	}

	
	

}
