package com.example;

public class Corredor implements Atleta {
    private String nombre;

    public Corredor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int realizarCompetencia() {
        return (int) (Math.random() * 100); 
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Atleta: " + nombre + ", Deporte: Carrera");
    }
}

