package org.juancalocutor.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {

    private List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina) {
        paginas.add(pagina);
        return this;
    }
    
    public String imprimir() {
        StringBuilder sb = new StringBuilder("\nTítulo: ").append(titulo)
        .append("\nAutor: ").append(autor).append("\nGénero: ").append(genero.getGenero());
        for (Imprimible Imp : paginas) {
            sb.append(Imp.imprimir() + "\n");
        }
        return sb.toString();
    }

}
