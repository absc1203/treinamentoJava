package br.com.stefanini.projetoDois.model;

public class Movimentacao {

	private Integer idMovimentacao;
	private String operacao;
	private Double valor;

	private Correntista correntista;

	public Movimentacao() {
		// TODO Auto-generated constructor stub
	}

	public Movimentacao(Integer idMovimentacao, String operacao, Double valor) {
		super();
		this.idMovimentacao = idMovimentacao;
		this.operacao = operacao;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Movimentacao [idMovimentacao=" + idMovimentacao + ", operacao=" + operacao + ", valor=" + valor + "]";
	}

	public Integer getIdMovimentacao() {
		return idMovimentacao;
	}

	public void setIdMovimentacao(Integer idMovimentacao) {
		this.idMovimentacao = idMovimentacao;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

}
