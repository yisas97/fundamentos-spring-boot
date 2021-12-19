package com.fundamentoplatzi.springboot.fundamentos.bean.reto.valores;

import com.fundamentoplatzi.springboot.fundamentos.bean.reto.operacion.IOperacionReto;

public class ValoresNumericos implements IValoresNumericos
{
	private IOperacionReto operacionReto;
	
	public ValoresNumericos(IOperacionReto operacionReto)
	{
		this.operacionReto = operacionReto;
	}
	
	@Override
	public void valores()
	{
		int numero1 = 10;
		int numero2 = 20;
		
		System.out.println("La suma del numero 10 y 20 es " + operacionReto.suma(numero1,numero2));
		System.out.println("La suma del numero 10 y 20 es " + operacionReto.producto(numero1,numero2));
	}
}
