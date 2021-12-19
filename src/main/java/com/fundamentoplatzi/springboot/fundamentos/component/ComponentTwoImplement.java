package com.fundamentoplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{
	@Override
	public void saludar() {
		System.out.println("hola mundo desde mi otro component");
	}
}
