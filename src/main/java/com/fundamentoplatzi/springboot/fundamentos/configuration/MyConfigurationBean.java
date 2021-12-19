package com.fundamentoplatzi.springboot.fundamentos.configuration;

import com.fundamentoplatzi.springboot.fundamentos.bean.*;
import com.fundamentoplatzi.springboot.fundamentos.bean.reto.operacion.IOperacionReto;
import com.fundamentoplatzi.springboot.fundamentos.bean.reto.operacion.OperacionReto;
import com.fundamentoplatzi.springboot.fundamentos.bean.reto.valores.IValoresNumericos;
import com.fundamentoplatzi.springboot.fundamentos.bean.reto.valores.ValoresNumericos;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean
{
	@Bean
	public MyBean beanOperation()
	{
		//New para instanciar la nueva implementacion
		return new MyBeanTwoImplement();
	}
	
	@Bean
	public MyOperation beanSumaOperation()
	{
		//New para instanciar la nueva implementacion
		return new MyOperationImplement();
	}
	
	@Bean
	public MyBeanWithDependency beanOperationSumaOperation(MyOperation myOperation)
	{
		//New para instanciar la nueva implementacion
		return new MyBeanWithDependencyImplement(myOperation);
	}
	
	@Bean
	public IOperacionReto Operaciones()
	{
		return new OperacionReto();
	}
	
	@Bean
	public IValoresNumericos ValorousNumerical(IOperacionReto operacionReto)
	{
		//New para instanciar la nueva implementacion
		return new ValoresNumericos(operacionReto);
	}
}
