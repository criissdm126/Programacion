package Enum_Mes;

public enum Mes {
	
    ENERO(1, 31),
    FEBRERO(2, 28),
    MARZO(3, 31),
    ABRIL(4, 30),
    MAYO(5, 31),
    JUNIO(6, 30),
    JULIO(7, 31),
    AGOSTO(8, 31),
    SEPTIEMBRE(9, 30),
    OCTUBRE(10, 31),
    NOVIEMBRE(11, 30),
    DICIEMBRE(12, 31);

    private final int orden;
    private final int numeroDias;

    Mes(int orden, int numeroDias) {
        this.orden = orden;
        this.numeroDias = numeroDias;
    }

    public int getOrden() {
        return orden;
    }

    public int getNumeroDias() {
        return numeroDias;
    }
}
