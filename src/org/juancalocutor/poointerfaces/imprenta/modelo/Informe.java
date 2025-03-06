package org.juancalocutor.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible {

    protected Persona autor, revisor;

    public Informe(String contenido, Persona autor, Persona revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por " + autor + ", revisado por: " + revisor + " y el contenido es: " + contenido;
    }

}
