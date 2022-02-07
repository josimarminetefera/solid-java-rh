package br.com.alura.rh.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

// INTERGAE SÓ DEFINE CONTRATO ELA NÃO MUDA TANTO QUANTO CLASS
public interface ValidacaoReajuste {
	public void validar(Funcionario funcionario, BigDecimal aumento);
}
