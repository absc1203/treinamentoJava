package br.com.stefanini.treinamento.controller;

import java.util.Date;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.stefanini.treinamento.entity.Usuario;

public class UsuarioValidate {

	public Boolean isNome(String nome) {
		Pattern pattern = Pattern.compile("[a-zA-Z ]{2,50}");
		Matcher matcher = pattern.matcher(nome);
		return matcher.matches();
	}

	public Boolean isIdUsuario(Integer idUsuario) {
		if (idUsuario <= 0) {
			return false;
		} else {
			return true;
		}
	}

	public Boolean isEmail(String email) {
		Pattern pattern = Pattern.compile(".+@.+\\.[a-z]+");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public Boolean isDataCriacao(Date dataCriacao) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2021, 7, 2, 23, 59, 59);
		if (dataCriacao.compareTo(calendar.getTime()) > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		Usuario usuario = new Usuario(10,"alberto","alberto@gmail.com", new Date());
		
		UsuarioValidate usuarioValidate = new UsuarioValidate();
		
		System.out.println("Nome: " + usuarioValidate.isNome(usuario.getNome()));
		System.out.println("Id: " + usuarioValidate.isIdUsuario(usuario.getIdUsuario()));
		System.out.println("Email: " + usuarioValidate.isEmail(usuario.getEmail()));
		System.out.println("Data: " + usuarioValidate.isDataCriacao(usuario.getDataCriacao()));
	}

}
