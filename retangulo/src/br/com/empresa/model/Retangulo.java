package br.com.empresa.model;

//Aula do dia 27/01/2021

public class Retangulo {

		private double altura;
		private double base;
		
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public double getAltura() {
			return this.altura;
		}
		
		public void setBase(double base) {
			this.base = base;
		}
		
		public double getBase() {
			return base;
		}
		
		public double calcularArea() {
			return this.base * this.altura;
		}
		
		public double calcularPerimetro() {
			return 2 * (this.base + this.altura);
			
		}
}
