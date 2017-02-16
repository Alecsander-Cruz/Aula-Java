package br.unipe.java.unidade1;

public class Vrum {

	private String motor;
	private String cor;
	private float potencia;
	private float velocidade;
	private int rodas;
	
	public void avançar(){
		System.out.println("Avançando");
	}
	
	public void retroceder(){
		System.out.println("Retrocedendo");
	}
	
	public void parar(){
		System.out.println("Parando");	
	}
	
	public void abastercer(){
		System.out.println("Abastecendo");
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	
	
}
