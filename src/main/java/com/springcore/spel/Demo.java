package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{11+22}")
	private int x;
	@Value("#{T(java.lang.Math).E}")
	private double y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	@Value("#{new java.lang.String('subesh')}")
	private String s;
	
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", s=" + s + "]";
	}
	
}

// use bool just use some expression in value annotation 
