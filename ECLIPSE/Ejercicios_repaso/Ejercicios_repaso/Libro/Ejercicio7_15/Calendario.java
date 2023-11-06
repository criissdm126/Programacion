package Ejercicio7_15;

public class Calendario {
    private int año;
    private int mes;
    private int dia;

    public Calendario(int año, int mes, int dia) {
        if (esFechaValida(año, mes, dia)) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Fecha no válida");
        }
    }

    public void incrementarDia() {
        dia++;
        if (dia > obtenerDiasEnMes(año, mes)) {
            dia = 1;
            incrementarMes();
        }
    }

    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            incrementarAño(1);
        }
    }

    public void incrementarAño(int cantidad) {
        año += cantidad;
        if (año <= 0) {
            año = 1;
        }
    }

    public void mostrar() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + año);
    }

    public boolean iguales(Calendario otraFecha) {
        return this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }

    private boolean esFechaValida(int año, int mes, int dia) {
        if (año <= 0 || mes < 1 || mes > 12 || dia < 1 || dia > obtenerDiasEnMes(año, mes)) {
            return false;
        }
        return true;
    }

    private int obtenerDiasEnMes(int año, int mes) {
        switch (mes) {
            case 2: // Febrero
                return 28;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                return 30;
            default:
                return 31;
        }
    }
}

