package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajustePorAno implements Reajuste {

	BigDecimal valor;
	LocalDate data;

	public ReajustePorAno(BigDecimal valor, LocalDate data) {
		super();
		this.valor = valor;
		this.data = data;
	}

	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public LocalDate data() {
		return data;
	}

}
