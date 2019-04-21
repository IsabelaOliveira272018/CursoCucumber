package br.com.curso_cucumber.services;

import br.com.curso_cucumber.entidades.Filme;
import br.com.curso_cucumber.entidades.NotaAluguel;
import br.com.curso_cucumber.entidades.TipoAluguel;
import br.com.curso_cucumber.utils.DateUtils;

public class AluguelService {

	public NotaAluguel alugar(Filme filme, TipoAluguel tipoAluguel) {
		if (filme.getEstoque() == 0)
			throw new RuntimeException("Filme sem estoque");

		NotaAluguel nota = new NotaAluguel();
		switch (tipoAluguel) {
			case COMUM:
				nota.setPreco(filme.getAluguel());
				nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));
				nota.setPontuacao(1);
			break;

			case EXTENDIDO:
				nota.setPreco(filme.getAluguel() *2);
				nota.setDataEntrega(DateUtils.obterDataDiferencaDias(3));
				nota.setPontuacao(2);
			break;
			
			case SEMANAL:
				nota.setPreco(filme.getAluguel() *3);
				nota.setDataEntrega(DateUtils.obterDataDiferencaDias(7));
				nota.setPontuacao(3);
			break;
			
		default:
			break;
		}
		if ("extendido".equals(tipoAluguel)) {
			nota.setPreco(filme.getAluguel() * 2);
			nota.setDataEntrega(DateUtils.obterDataDiferencaDias(3));
			nota.setPontuacao(2);
		} else if ("semanal".equals(tipoAluguel)) {
			nota.setPreco(filme.getAluguel() * 3);
			nota.setDataEntrega(DateUtils.obterDataDiferencaDias(7));
			nota.setPontuacao(3);
		} else {
			nota.setPreco(filme.getAluguel());
			nota.setDataEntrega(DateUtils.obterDataDiferencaDias(1));
			nota.setPontuacao(1);

		}
		filme.setEstoque(filme.getEstoque() - 1);
		return nota;

	}

}
