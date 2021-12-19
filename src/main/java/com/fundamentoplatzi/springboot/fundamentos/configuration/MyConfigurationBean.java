package com.fundamentoplatzi.springboot.fundamentos.configuration;

import com.fundamentoplatzi.springboot.fundamentos.bean.*;
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
}
