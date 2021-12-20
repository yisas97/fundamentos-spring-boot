package com.fundamentoplatzi.springboot.fundamentos.bean;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties
{
	//Parametros
	private String name;
	private String apellido;
	
	public MyBeanWithPropertiesImplement(String name,
										 String apellido) {
		this.name = name;
		this.apellido = apellido;
	}
	
	@Override
	public String function() {
		return name + "-" + apellido;
	}
}
