package com.travelhub.pritam.bean;

import org.springframework.stereotype.Component;

@Component(value="bank")
public class Bank {
	Bank(){
		System.out.println("Bank Object is created...");
	}
	public double calculateCompoundInterest(double pamt, double rate, double time) {
		System.out.println("Bank.calculateCI() is called");
		return (pamt*Math.pow(1+rate/100, time))-pamt;
		}
}
