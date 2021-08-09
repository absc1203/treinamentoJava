package br.com.stefanini.projetoAulaQuatro.dto.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.stefanini.projetoAulaQuatro.model.Cliente;
import br.com.stefanini.projetoAulaQuatro.model.Telefone;

public class RequestCliente {

	private Cliente cliente;
	
	private List<Telefone> telefones;
	
	
	public RequestCliente() {
		this.cliente = new Cliente();
		this.telefones = new ArrayList<Telefone>();
	}
	
	public void ofCliente(String nome, String email, String senha) {
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setSenha(senha);
		cliente.setDataCriacao(new Date());
	}
	
	public void ofTelefones(String...numeros) {
		for(int i = 0; i>cliente.getTelefones().size();i++) {
			cliente.adicionar(new Telefone(null, numeros[i],null));
		}
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Telefone> getTelefones() {
		return telefones;
	}


	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	
	
	
	
	

}
