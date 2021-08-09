package br.com.stefanini.projetoAulaQuatro.persistence;

import br.com.stefanini.projetoAulaQuatro.model.Cliente;

public interface IClienteDAO {
	
	public Cliente findById(int id) throws Exception;
	public Integer createClienteTelefone(Cliente cliente) throws Exception;

}
