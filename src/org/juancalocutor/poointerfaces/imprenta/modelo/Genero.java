package org.juancalocutor.poointerfaces.imprenta.modelo;

public enum Genero {

    ACCION("Acción"), DRAMA("Drama"), AVENTURA("Drama"), POLICIA("Policía");

    private final String genero;

    private Genero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

}
