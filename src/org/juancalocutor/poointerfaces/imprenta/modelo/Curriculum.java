package org.juancalocutor.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {

    private String profesion;
    private Persona persona;
    private List<String> experiencia;

    public Curriculum(Persona persona, String profesion, String contenido) {
        super(contenido);
        this.persona = persona;
        this.profesion = profesion;
        this.experiencia = new ArrayList<>();
    }

    public Curriculum addExperiencia(String exp) {
        experiencia.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("\nNombre: ").append(persona)
                .append("\nProfesión: ").append(profesion)
                .append("\nContenido: ").append(contenido)
                .append("\nExperiencias: \n");
        for (String exp : experiencia) {
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }

}
