package ar.edu.UnlamPBII.Institucion;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Asistencia {

   
    private Set<RegistroAsistencia> registros;

    public Asistencia() {
        this.registros = new HashSet<>();
    }

    public boolean registrarAsistencia(Alumno alumno, LocalDate fecha) {
       
        RegistroAsistencia nuevoRegistro = new RegistroAsistencia(alumno, fecha);
        if (registros.contains(nuevoRegistro)) {
            return false; 
        }
        registros.add(nuevoRegistro);
        return true; 
    }

    public boolean tieneAsistencia(Alumno alumno, LocalDate fecha) {
        return registros.contains(new RegistroAsistencia(alumno, fecha));
    }

    private static class RegistroAsistencia {
        private Alumno alumno;
        private LocalDate fecha;

        public RegistroAsistencia(Alumno alumno, LocalDate fecha) {
            this.alumno = alumno;
            this.fecha = fecha;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RegistroAsistencia that = (RegistroAsistencia) o;
            return alumno.equals(that.alumno) && fecha.equals(that.fecha);
        }

        @Override
        public int hashCode() {
            int result = alumno.hashCode();
            result = 31 * result + fecha.hashCode();
            return result;
        }
    }
}
