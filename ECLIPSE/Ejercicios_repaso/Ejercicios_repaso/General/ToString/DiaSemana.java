package ToString;

public enum DiaSemana {
	
    LUNES("Laborable"),
    MARTES("Laborable"),
    MIERCOLES("Laborable"),
    JUEVES("Laborable"),
    VIERNES("Laborable"),
    SABADO("No laborable"),
    DOMINGO("No laborable");

    private final String estadoLaboral;

    DiaSemana(String estadoLaboral) {
        this.estadoLaboral = estadoLaboral;
    }

    @Override
    public String toString() {
        return estadoLaboral;
    }
}
