package org.juancalocutor.poointerfaces.imprenta.modelo;

public interface Imprimible {

    String imprimir();

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
