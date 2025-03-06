package org.juancalocutor.poointerfaces.imprenta;

import org.juancalocutor.poointerfaces.imprenta.modelo.*;
import static org.juancalocutor.poointerfaces.imprenta.modelo.Genero.*;
import static org.juancalocutor.poointerfaces.imprenta.modelo.Imprimible.imprimir;

public class App {
    public static void main(String[] args) throws Exception {

        Curriculum cv = new Curriculum(new Persona("Juan", "Gutierrez"), "Psicólogo", "Resumen laboral")
                .addExperiencia("Locutor").addExperiencia("Periodista").addExperiencia("WordPress")
                .addExperiencia("Java");

        Informe informe = new Informe("Inteligencias multiples", new Persona("Howard", "Gardner"),
                new Persona("Juan", "Gutierrez"));

        Libro libro = new Libro(new Persona("Victor", "Hugo"), "El 93", ACCION)
                .addPagina(new Paginas("\nRevolución francesa")).addPagina(new Paginas("Armada"))
                .addPagina(new Paginas("Ejércitos"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

}
