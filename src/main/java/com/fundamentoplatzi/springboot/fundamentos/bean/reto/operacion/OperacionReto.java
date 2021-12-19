package com.fundamentoplatzi.springboot.fundamentos.bean.reto.operacion;

public class OperacionReto implements IOperacionReto
{
	@Override
	public double suma(double a, double b) {
		return a+b;
	}
	
	@Override
	public double producto(double a, double b) {
		return a*b;
	}
}
