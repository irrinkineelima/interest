package com.epam.interest;

public class Compound {
	double p;
	double r;
	double t;
	public Compound(double p,double r,double t){
		this.p=p;
		this.r=r;
		this.t=t;
	}
	public double cal() {
		return Math.round(this.p*Math.pow(1+this.r/100.0,this.t));
	}
}
