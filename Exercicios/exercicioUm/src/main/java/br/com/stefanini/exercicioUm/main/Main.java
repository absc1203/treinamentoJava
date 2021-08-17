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
				"C");
		Questao questao2 = new Questao("O que � POO?", "A) Prato Oval Obl�quio", "B) Programa��o Orientada a Objetos",
				"C) Parte Oeste de Otawa", "B");
		Questao questao3 = new Questao(
				"Quanto �s linguagens de programa��o, assinale a alternativa que esteja tecnicamente incorreta",
				"A) Java � uma das principais representantes das linguagens orientadas a objetos",
				"B) JavaScript, � uma sub-l�nguagem do Java, feita para o desenvolvimento de aplica��es para Android",
				"C) Grande parte dos sistemas operacionais existentes no mercado foram escritos em C", "B");

		List<Questao> questoes = new ArrayList<>();
		questoes.add(questao1);
		questoes.add(questao2);
		questoes.add(questao3);

		Prova prova = new Prova(1, "Java", new Date(), questoes);
		Aluno aluno = new Aluno(1, "Andr�", prova);

		System.out.println("Ol� " + aluno.getNome());
		System.out.println("Prova de " + prova.getMateria() + "Data" + prova.getDataProva());
		String resp = "";

		for (Questao questao : questoes) {

			System.out.println("\n" + questao.getEnunciado());
			System.out.println(
					questao.getAlternativa1() + "\n" + questao.getAlternativa2() + "\n" + questao.getAlternativa3());
			Scanner t = new Scanner(System.in);
			resp += t.nextLine().toUpperCase();
		}

		int pontos = 0;

		if (resp.substring(0,1).equals(questao1.getAlternativaCorreta())) {
			System.out.println("Quest�o 1 - Correta");
			pontos++;
		} else {
			System.out.println("Quest�o 1 - Errada - resposta correta letra " + questao1.getAlternativaCorreta());
		}

		if (resp.substring(1,2).equals(questao2.getAlternativaCorreta())) {
			System.out.println("Quest�o 2 - Correta");
			pontos++;
		} else {
			System.out.println("Quest�o 2 - Errada - resposta correta letra " + questao2.getAlternativaCorreta());
		}

		if (resp.substring(2,3).equals(questao3.getAlternativaCorreta())) {
			System.out.println("Quest�o 3 - Correta");
			pontos++;
		} else {
			System.out.println("Quest�o 3 - Errada - resposta correta letra " + questao3.getAlternativaCorreta());
		}

		System.out.println("Prova acabada, sua pontua��o foi " + pontos);

	}

}
