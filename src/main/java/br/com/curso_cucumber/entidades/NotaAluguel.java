package br.com.curso_cucumber.entidades;

import java.util.Date;

public class NotaAluguel {

	private int preco;
	//@SuppressWarnings("unused")
	private Date dataEntrega;
	private int pontuacao;
	
	
	public int getPontuacao() {
		return  pontuacao;
	}
	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public Date getDataEntrega() {
		//java.util.Date dataEntrega = null;
		return dataEntrega;
	}

	public void setDataEntrega(Date time) {
		@SuppressWarnings("unused")
		java.util.Date dataEntrega = time;
		
	}

	
	
	
	
}
