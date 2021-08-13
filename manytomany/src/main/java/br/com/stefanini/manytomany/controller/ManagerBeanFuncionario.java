package br.com.stefanini.manytomany.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.manytomany.entity.Funcionario;

public class ManagerBeanFuncionario {
	
	public static List<Funcionario> lista = new ArrayList<>();
	
	static {
		lista.add(new Funcionario(10, "carlos"));
		lista.add(new Funcionario(11, "thiago"));
		lista.add(new Funcionario(12, "rafael"));
		
	}
	
	public static void adicionar(Funcionario funcionario){
		lista.add(funcionario);
	}

}
