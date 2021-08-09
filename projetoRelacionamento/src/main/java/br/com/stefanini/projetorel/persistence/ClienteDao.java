package br.com.stefanini.projetorel.persistence;

import br.com.stefanini.projetorel.dto.response.ClienteResponse;

public class ClienteDao extends Dao{
 // Sempre assina a classe de Negocio, 
	//com as interfaces ...
	public ClienteResponse findByCode(int code) throws Exception {
		open();
		stmt = con.prepareStatement("select u.id,  u.nome, u.email, u.senha,"
				+ "c.perfil, c.status from usuario u left join cliente c on u.id = c.idCliente and c.idCliente=?");
		stmt.setInt(1, code);
		rs = stmt.executeQuery();
		ClienteResponse clienteDTO = null;
		if (rs.next()) {
			clienteDTO = new ClienteResponse();
			clienteDTO.setIdCliente(rs.getInt(1));
			clienteDTO.setNome(rs.getString(2));
			clienteDTO.setEmail(rs.getString(3));
			clienteDTO.setSenha(rs.getString(4));
			clienteDTO.setPerfil(rs.getString(5));
			clienteDTO.setStatus(rs.getString(6));
			
		}

		close();
		return clienteDTO;
	}
	
	
	public static void main(String[] args) {
		
		try {
			
			ClienteResponse cliente = new ClienteDao().findByCode(100);
			System.out.println(cliente);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
