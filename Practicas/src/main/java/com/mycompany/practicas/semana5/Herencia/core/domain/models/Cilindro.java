package com.mycompany.practicas.Semana5.Herencia.core.domain.models;

public class Cilindro extends Circulo {

    private double altura;

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // Area total = 2 * area de las 2 tapas + area lateral
        return 2 * Math.PI * radio * (radio + altura);
    }

    public double calcularVolumen() {
        return Math.PI * radio * radio * altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" + "radio=" + radio + ", altura=" + altura + '}';
    }
}
