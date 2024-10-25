package com.example;

public class Saltador implements Atleta {
    private String nombre;

    public Saltador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int realizarCompetencia() {
        return (int) (Math.random() * 100); 
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Atleta: " + nombre + ", Deporte: Salto");
    }
}

