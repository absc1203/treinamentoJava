package br.com.stefanini.projetoAulaQuatro.model;

public class Telefone {

	private Integer idTelefone;
	private String numero;

	private Cliente cliente;

	public Telefone() {
	}

	public Telefone(Integer idTelefone, String numero, Cliente cliente) {
		super();
		this.idTelefone = idTelefone;
		this.numero = numero;
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", numero=" + numero + ", cliente=" + cliente + "]";
	}

	public Integer getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
