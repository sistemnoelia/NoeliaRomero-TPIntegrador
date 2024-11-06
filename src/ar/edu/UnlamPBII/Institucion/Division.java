package ar.edu.UnlamPBII.Institucion;

public enum Division {
    PRIMERO(6, 7),
    SEGUNDO(7, 8),
    TERCERO(8, 9),
    CUARTO(9, 10),
    QUINTO(10, 11),
    SEXTO(11, 12),
    PRIMERO_SECUNDARIA(12, 13),
    SEGUNDO_SECUNDARIA(13, 14),
    TERCERO_SECUNDARIA(14, 15),
    CUARTO_SECUNDARIA(15, 16),
    QUINTO_SECUNDARIA(16, 17),
    SEXTO_SECUNDARIA(17, 18);

    private final int edadMinima;
    private final int edadMaxima;

    // Constructor para asociar el rango de edades con cada división
    Division(int edadMinima, int edadMaxima) {
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    // Método estático para obtener la división por edad
    public static Division getDivisionPorEdad(int edad) {
        for (Division division : Division.values()) {
            if (edad >= division.getEdadMinima() && edad <= division.getEdadMaxima()) {
                return division;
            }
        }
        return null; // En caso de no encontrar una división válida
    }
}



