package br.com.curso_cucumber.services;

import br.com.curso_cucumber.entidades.Filme;
import br.com.curso_cucumber.entidades.NotaAluguel;
import br.com.curso_cucumber.utils.DateUtils;

public class AluguelService {

	public NotaAluguel alugar(Filme filme) {
		if (filme.getEstoque() == 0)
			throw new RuntimeException("Filme sem estoque");

		NotaAluguel nota = new NotaAluguel();
		nota.setPreco(filme.getAluguel());
		nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));

		filme.setEstoque(filme.getEstoque() - 1);
		return nota;

	}

}
