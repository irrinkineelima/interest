package com.epam.interest;

public class Simple {
	double p;
	double r;
	double t;
	public Simple(double p,double r,double t){
		this.p=p;
		this.r=r;
		this.t=t;
	}
	public double cal() {
		return Math.round((this.p*this.r*this.t)/100.0);
	}
}
