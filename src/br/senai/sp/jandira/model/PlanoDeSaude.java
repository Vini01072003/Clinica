package br.senai.sp.jandira.model;

public class PlanoDeSaude {
	
	
	private String operadora;
	private String tipoDoPlano;
	
	
	
	public void setOperadora(String operadora ) {
	this.operadora = operadora;	
		
	}
	
	public String getOperadora() {
	return this.operadora;
	}
	
	public void settipoDoPlano(String tipoDoPlano) {
		this.tipoDoPlano = tipoDoPlano;
	}
	
	
	
	public String getTipoDoPlano() {
	return this.tipoDoPlano;

	}
	
	
	public String getDadosDoPlano() {
		return "Plano: " + this.operadora + ", " + this.tipoDoPlano;
	}
		
		
	}


