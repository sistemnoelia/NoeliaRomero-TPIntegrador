package ar.edu.UnlamPBII.Institucion;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class Cursos {
    private String nombre;
    protected List<Docente> docentes;
    protected List<Alumno> alumnos;

    
    public Cursos(String nombre) {
        this.nombre = nombre;
        this.docentes = new LinkedList<>();
        this.alumnos = new LinkedList<>();
    }
    
    public void agregarDocente(Docente docente) {
        docentes.add(docente);
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
    // Ordena por apellido y nombre
    
    public List<Alumno> obtenerAlumnosOrdenados() {
        Collections.sort(alumnos);
        return alumnos;
    }



}
