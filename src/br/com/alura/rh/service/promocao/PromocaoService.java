package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if(Cargo.GERENTE == cargoAtual) {
			throw new ValidacaoException("Gerente n�o pode ser promovido");
		}
		
		if (metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		}else {
			throw new ValidacaoException("Funcion�rio n�o bateu a meta");
		}
	}
}
