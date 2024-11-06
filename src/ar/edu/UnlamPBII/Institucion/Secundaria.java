package ar.edu.UnlamPBII.Institucion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Secundaria extends Cursos {
    private List<Alumno> alumnos; 
    public Secundaria(String nombre) {
        super(nombre);
        alumnos = new LinkedList<>();
    }

    @Override
    public void agregarAlumno(Alumno alumno) {
        // Asignar al curso según la edad del alumno usando el enum Division
        Division division = Division.getDivisionPorEdad(alumno.getEdad());
        if (division != null) {
            alumnos.add(alumno);
            
        }
    }

    // Método para obtener los alumnos por división
    public List<Alumno> obtenerAlumnosPorDivision(Division division) {
        List<Alumno> alumnosDivision = new ArrayList<>();
        for (Alumno alumno : alumnos) {
            if (alumno.getEdad() >= division.getEdadMinima() && alumno.getEdad() <= division.getEdadMaxima()) {
                alumnosDivision.add(alumno);
            }
        }
        return alumnosDivision;
    }
    
    
    public List<Alumno> obtenerAlumnosOrdenadosPorDni() {
        // Ordenamos la lista de alumnos por DNI de menor a mayor
        List<Alumno> alumnosOrdenados = new ArrayList<>(alumnos);
        Collections.sort(alumnosOrdenados, (a1, a2) -> a1.getDni().compareTo(a2.getDni()));
        return alumnosOrdenados;
    }
    
    public Alumno buscarAlumnoPorDni(Integer dni) {
        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equals(dni)) {
                return alumno; 
            }
        }
        return null; 
    }
}



