package com.fundamentoplatzi.springboot.fundamentos;

import com.fundamentoplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentoplatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentoplatzi.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentoplatzi.springboot.fundamentos.bean.reto.valores.IValoresNumericos;
import com.fundamentoplatzi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentoplatzi.springboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner
{
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private IValoresNumericos valoresNumericos;
	private MyBeanWithProperties myBeanWithProperties;
	private UserPojo userPojo;
	
	//No se puede tener dos componente en un solo interface ya que no se puede saber cual tomar
	//Por eso se utilizar ql @Qualifier para llamar que component llamar
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
								  MyBean myBean,
								  MyBeanWithDependency myBeanWithDependency,
								  IValoresNumericos valoresNumericos,
								  MyBeanWithProperties myBeanWithProperties,
								  UserPojo userPojo)
	{
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.valoresNumericos = valoresNumericos;
		this.myBeanWithProperties = myBeanWithProperties;
		this.userPojo = userPojo;
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
		myBean.print();
		myBeanWithDependency.printWithDependency();
		valoresNumericos.valores();
		System.out.println(myBeanWithProperties.function());
		
		System.out.println(userPojo.getEmail() + "-" + userPojo.getPassword());
	}
}
