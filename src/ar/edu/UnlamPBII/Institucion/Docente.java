package ar.edu.UnlamPBII.Institucion;

public class Docente {
	public String nombre;
	public String apellido;
	public  Integer dni;
	public String especializacion;
	
	
	public Docente(String nombre, String apellido, Integer dni, String especializacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.especializacion = especializacion;
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
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getEspecializacion() {
		return especializacion;
	}
	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}
	
	@Override
    public String toString() {
        return nombre + " " + apellido + " - " + especializacion
        		;
    }

}
