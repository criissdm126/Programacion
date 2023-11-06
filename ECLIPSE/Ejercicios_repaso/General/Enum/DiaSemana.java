package Enum;

public enum DiaSemana {
	
	
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    private final boolean laboral;

    DiaSemana(boolean laboral) {
        this.laboral = laboral;
    }

    public boolean esLaboral() {
        return laboral;
    }
}