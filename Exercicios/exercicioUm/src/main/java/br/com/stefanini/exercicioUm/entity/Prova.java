package br.com.stefanini.exercicioUm.entity;

import java.util.Date;
import java.util.List;

public class Prova {
	
	private Integer idProva;
	private String materia;
	private Date dataProva;
	private List<Questao> questoes;
	
	public Prova() {
	
	}

	public Prova(Integer idProva,String materia, Date dataProva, List<Questao> questoes) {
		super();
		this.idProva = idProva;
		this.materia = materia;
		this.dataProva = dataProva;
		this.questoes = questoes;
	}
	
	

	@Override
	public String toString() {
		return "Prova (materia=" + materia + ", dataProva=" + dataProva + ", questoes=" + questoes + ")";
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Date getDataProva() {
		return dataProva;
	}

	public void setDataProva(Date dataProva) {
		this.dataProva = dataProva;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

	public Integer getIdProva() {
		return idProva;
	}

	public void setIdProva(Integer idProva) {
		this.idProva = idProva;
	}
	
	
	
	
	
	
}
