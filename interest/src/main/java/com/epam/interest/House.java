package com.epam.interest;

public class House {
	double area;
	int op;
	public House(double area,int op) {
		this.area=area;
		this.op=op;
	}
	public double cal() {
		if(op==1) {
			return area*1200;
		}
		else if(op==2) {
			return area*1500;
		}
		else if(op==3) {
			return area*1800;
		}
		else {
			return area*2500;
		}
	}
}
