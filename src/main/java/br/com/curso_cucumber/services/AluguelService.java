package br.com.curso_cucumber.services;

import java.util.Calendar;

import br.com.curso_cucumber.entidades.Filme;
import br.com.curso_cucumber.entidades.NotaAluguel;

public class AluguelService {

	public NotaAluguel alugar(Filme filme) {
		if(filme.getEstoque() == 0) 
			throw new RuntimeException("Filme sem estoque");
		NotaAluguel nota = new NotaAluguel();
		nota.setPreco(filme.getAluguel());
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		nota.setDataEntrega(cal.getTime());
		nota.setDataEntrega(cal.getTime());
		filme.setEstoque(filme.getEstoque() - 1);
		return nota;
		
	} 

}
