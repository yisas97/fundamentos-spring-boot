package com.fundamentoplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency
{
	
	private final Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);
	
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
		LOGGER.info("Hemos ingresado al metodo printWitdhDependency");
		int numero = 1;
		LOGGER.debug("El numero enviado como parametro a la dependencia operacion es " + numero);
		System.out.println(myOperation.sum(numero));;
		System.out.println("Hola desde la implementacion de un bean con dependencia");
	}
}
