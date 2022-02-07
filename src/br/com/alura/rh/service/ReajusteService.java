package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ReajusteService {

	// PRINCIPIO DE LISCOV
	private List<ValidacaoReajuste> validacoes;

	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		// para percorrer a lista de validações
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		
		// Essas linhas aqui seria o que a funcionalidade acima faz
		// ValidacaoPercentualReajuste validacaoPercentualReajuste = new ValidacaoPercentualReajuste();
		// ValidacaoPeriodicidadeEntreReajustes validacaoPeriodicidadeEntreReajustes = new ValidacaoPeriodicidadeEntreReajustes();
		// validacaoPercentualReajuste.validar(funcionario, aumento);
		// validacaoPeriodicidadeEntreReajustes.validar(funcionario, aumento);

		BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}

}
