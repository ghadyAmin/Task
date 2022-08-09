package com.task5.Task.models;

public class Result {
	int x;
	int y;
	int sum;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public Result(int x, int y, int sum) {
		super();
		this.x = x;
		this.y = y;
		this.sum = sum;
	}
	

}
