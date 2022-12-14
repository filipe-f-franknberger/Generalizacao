package com.filipe.conta;

public class ContaEspecial extends Conta {

	private int diasSemJuros;
	private double limite;
	
	public ContaEspecial(String banco, int agencia, int numero_conta, double saldo) {
		super(banco,agencia,numero_conta,saldo);
	}

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append("]");
		return builder.toString();
	}
	
}
