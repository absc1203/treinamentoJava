package br.com.stefanini.exercicioUm.entity;

public class Questao {
	
	private String enunciado;
	private String alternativa1;
	private String alternativa2;
	private String alternativa3;
	private String alternativaCorreta;
	
	public Questao() {
	
	}

	
	public Questao(String enunciado, String alternativa1, String alternativa2, String alternativa3,
			String alternativaCorreta) {
		super();
		this.enunciado = enunciado;
		this.alternativa1 = alternativa1;
		this.alternativa2 = alternativa2;
		this.alternativa3 = alternativa3;
		this.alternativaCorreta = alternativaCorreta;
	}


	@Override
	public String toString() {
		return "Questao [enunciado=" + enunciado + "alternativa1=" + alternativa1
				+ ", alternativa2=" + alternativa2 + ", alternativa3=" + alternativa3 + ", alternativaCorreta="
				+ alternativaCorreta + "]";
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getAlternativa1() {
		return alternativa1;
	}

	public void setAlternativa1(String alternativa1) {
		this.alternativa1 = alternativa1;
	}

	public String getAlternativa2() {
		return alternativa2;
	}

	public void setAlternativa2(String alternativa2) {
		this.alternativa2 = alternativa2;
	}

	public String getAlternativa3() {
		return alternativa3;
	}

	public void setAlternativa3(String alternativa3) {
		this.alternativa3 = alternativa3;
	}

	public String getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(String alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}

	
	

}