package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements Reajuste{

	BigDecimal valor;
	LocalDate data;
	
	public Promocao(BigDecimal valor, LocalDate data) {
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


	@Override
	public BigDecimal valorImpostoRenda() {
		return valor.multiply(new BigDecimal(0.1));
	}

}
