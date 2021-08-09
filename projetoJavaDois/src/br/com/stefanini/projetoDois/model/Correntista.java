package br.com.stefanini.projetoDois.model;

import java.util.List;

public class Correntista {

	// OneToMany (O total será realizado no One)
	private Integer idCorrentista;
	private String nome;
	private String email;
	private Double saldo = 0.;

	private List<Movimentacao> movimentacoes;

	public Correntista() {
	}

	public Correntista(Integer idCorrentista, String nome, String email, Double saldo) {
		super();
		this.idCorrentista = idCorrentista;
		this.nome = nome;
		this.email = email;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Correntista [idCorrentista=" + idCorrentista + ", nome=" + nome + ", email=" + email + ", saldo="
				+ saldo + "]";
	}

	public Integer getIdCorrentista() {
		return idCorrentista;
	}

	public void setIdCorrentista(Integer idCorrentista) {
		this.idCorrentista = idCorrentista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

	
	
	

}
