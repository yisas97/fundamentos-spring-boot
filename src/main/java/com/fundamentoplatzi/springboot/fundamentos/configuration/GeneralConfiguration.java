package com.fundamentoplatzi.springboot.fundamentos.configuration;

import com.fundamentoplatzi.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentoplatzi.springboot.fundamentos.bean.MyBeanWithPropertiesImplement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration
{
	@Value("${value.name}")
	private String name;
	
	@Value("${value.apellido}")
	private String apellido;
	
	@Value("${value.random}")
	private String random;
	
	@Bean
	public MyBeanWithProperties function()
	{
		return new MyBeanWithPropertiesImplement(name,apellido);
		
	}
}
