package com.example;

public class Torneo {
    public void organizarCompetencia(Atleta atleta) {
        atleta.mostrarInformacion();
        int puntaje = atleta.realizarCompetencia();
        System.out.println("Puntaje: " + puntaje);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        Corredor corredor = new Corredor("Juan");
        Nadador nadador = new Nadador("Ana");
        Saltador saltador = new Saltador("Pedro");

        torneo.organizarCompetencia(corredor);
        torneo.organizarCompetencia(nadador);
        torneo.organizarCompetencia(saltador);
    }
}

