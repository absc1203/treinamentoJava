package br.com.stefanini.projetoDois.controller;

import java.util.ArrayList;

import br.com.stefanini.projetoDois.model.Correntista;
import br.com.stefanini.projetoDois.model.Movimentacao;

public class ControllerMovimentacao {

	private Correntista correntista;

	public ControllerMovimentacao(Correntista correntista, Movimentacao movimentacao) {
		this.correntista = correntista;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public Correntista adicionarMovimentacao(Movimentacao movimentacao) {
		if (correntista.getMovimentacoes() == null) {
			correntista.setMovimentacoes(new ArrayList<Movimentacao>());
		}
		if (movimentacao.getOperacao().equals("retirada")) {
			if (correntista.getSaldo() >= movimentacao.getValor()) {
				correntista.setSaldo(correntista.getSaldo() - movimentacao.getValor());
			} else {
				throw new IllegalArgumentException("Operação não efetuada");
			}
		} else if (movimentacao.getOperacao().equals("deposito")) {
			correntista.setSaldo(correntista.getSaldo() + movimentacao.getValor());
		} else {
			throw new IllegalArgumentException("Movimentação desconhecida");
		}
		
		correntista.getMovimentacoes().add(movimentacao);
		return correntista;

	}

}
