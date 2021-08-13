package br.com.stefanini.exercicioUm.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.stefanini.exercicioUm.entity.Aluno;
import br.com.stefanini.exercicioUm.entity.Prova;
import br.com.stefanini.exercicioUm.entity.Questao;

public class Main {

	public static void main(String[] args) {

		Questao questao1 = new Questao("O que � Java?", "A) Um carro", "B) Uma arma", "C) Linguagem de Programa��o",
				null);
		Questao questao2 = new Questao("O que � POO?", "A) Prato Oval Obl�quio", "B) Programa��o Orientada a Objetos",
				"C) Parte Oeste de Otawa", null);
		
		questao1.setAlternativaCorreta(questao1.getAlternativa3());
		questao2.setAlternativaCorreta(questao2.getAlternativa2());
		
		List<Questao> questoes = new ArrayList<>();
		questoes.add(questao1);
		questoes.add(questao2);

		Prova prova = new Prova(1, "Java", new Date(), questoes);
		Aluno aluno = new Aluno(1, "Andr�", prova);
		
		System.out.println("Ol� " + aluno.getNome());
		System.out.println("Prova de " + prova.getMateria() + "Data" + prova.getDataProva());
		String resp = "";
		
		for(Questao questao : questoes) {

			System.out.println("\n"+questao.getEnunciado() );
			System.out.println(questao.getAlternativa1()+"\n"+ questao.getAlternativa2()+"\n"+questao.getAlternativa3());
			Scanner t = new Scanner(System.in);
			resp +=  t.next();
		}
		
		int pontos = 0;
		
		if(resp.substring(0).toUpperCase().equals("C")) {
			System.out.println("Quest�o 1 - Correta");
			pontos++;
		} else {
			System.out.println("Quest�o 1 - Errada - resposta correta letra C");
		}
		
		if(resp.substring(1).toUpperCase().equals("B")) {
			System.out.println("Quest�o 2 - Correta");
			pontos++;
		} else {
			System.out.println("Quest�o 2 - Errada - resposta correta letra B");
		}
		
		System.out.println("Prova acabada, sua pontua��o foi " + pontos);
		
		
	}

}
