package ar.edu.UnlamPBII.Institucion;

public class Alumno implements Comparable<Alumno> {
	public String nombre;
	public String apellido;
	public  Integer dni;
	public Integer edad;

	

	public Alumno(String nombre, String apellido, Integer dni, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}
	

	public Integer getDni() {
		return dni;
	}


	public void setDni(Integer dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apelliido) {
		this.apellido = apelliido;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	@Override
	public int compareTo(Alumno alu) {
        int comparoApellido = this.apellido.compareTo(alu.getApellido());
        if (comparoApellido == 0) {
            return this.nombre.compareTo(alu.getNombre());
        }
        return comparoApellido;
    }

	 @Override
	    public String toString() {
	        return nombre + " " + apellido;
	    }

	
	
	}



