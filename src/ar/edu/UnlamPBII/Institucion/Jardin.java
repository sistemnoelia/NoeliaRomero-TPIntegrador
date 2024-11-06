package ar.edu.UnlamPBII.Institucion;

import java.util.ArrayList;
import java.util.List;

public class Jardin extends Cursos {
	public String nombre;
	private List<Alumno>[] salas;

	public Jardin(String nombre) {
		super(nombre);
		salas = new ArrayList[Salas.values().length];

		for (int i = 0; i < salas.length; i++) {
			salas[i] = new ArrayList<>();
		}

	}

	public boolean agregarAlumno(Salas sala, Alumno alumno) {
		int indiceSala = sala.ordinal();
		salas[indiceSala].add(alumno);
		return true;
	}

	// Obtener los alumnos ordenados por apellido y nombre
	public List<Alumno> obtenerAlumnosOrdenados() {
		List<Alumno> todosLosAlumnos = new ArrayList<>();

		// Recopila todos los alumnos de todas las salas
		for (List<Alumno> listaAlumnos : salas) {
			todosLosAlumnos.addAll(listaAlumnos);
		}
		 todosLosAlumnos.sort(null); // Utiliza el compareTo de la clase Alumno
	        return todosLosAlumnos;
	}
	
    private String asignarSalaPorEdad(Alumno alumno) {
        if (alumno.getEdad() <= 3) {
            return "Roja";
        } else if (alumno.getEdad() <= 4) {
            return "Azul";
        } else if (alumno.getEdad() <= 5) {
            return "Verde";
        } else {
            return "Celeste";
        }
    }
}
	

