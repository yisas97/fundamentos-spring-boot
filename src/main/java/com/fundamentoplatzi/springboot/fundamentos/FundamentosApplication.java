package com.fundamentoplatzi.springboot.fundamentos;

import com.fundamentoplatzi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner
{
	private ComponentDependency componentDependency;
	
	//No se puede tener dos componente en un solo interface ya que no se puede saber cual tomar
	//Por eso se utilizar ql @Qualifier para llamar que component llamar
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency)
	{
		this.componentDependency = componentDependency;
	}
	
	public static void main(String[] args)
	{
		//el metodo main
		SpringApplication.run(FundamentosApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		//Inyectar de la compoenetdependency
		componentDependency.saludar();
	}
}
