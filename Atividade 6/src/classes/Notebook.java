package classes;

import interfaces.Computador;
import interfaces.Processador;
import interfaces.Teclado;

public class Notebook implements Computador, Processador, Teclado{
	
	private String marca;
	private String modelo;
	
	public Notebook(String marca, String modelo) {
		this.setMarca(marca);
		this.setModelo(modelo);
	}
	
	
	@Override
	public String getTipoTela() {
		return "LED";
	}
	@Override
	public String getTipoComputador() {
		return "Notebook";
	}
	
	@Override
	public String getModeloProcessador() {
		return "Intel I5";
	}
	@Override
	public double getVelocidade() {
		return 3.9;
	}
	@Override
	public String getCor() {
		return "Black";
	}
	@Override
	public String getFormato() {
		return "ABNT2";
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Notebook\nMarca: " + marca + "\nModelo: " + modelo;
	}
	
}
