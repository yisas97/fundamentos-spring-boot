package com.fundamentoplatzi.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency
{
	//Esta llamando al Bean de Operacion
	// Donde se utiliza la operacion suma
	// Es decir estoy llamando un bena utilizando otro bean
	private MyOperation myOperation;
	
	//Creando el constructor del bean operation
	public MyBeanWithDependencyImplement(MyOperation myOperation) {
		this.myOperation = myOperation;
	}
	
	@Override
	public void printWithDependency()
	{
		int numero = 1;
		System.out.println(myOperation.sum(numero));;
		System.out.println("Hola desde la implementacion de un bean con dependencia");
	}
}
