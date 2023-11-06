package Ficheros_2;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Socio implements Serializable {

    private static final long serialVersionUID = 1L;
    private static int ultimoNumeroSocio = 1;
    private int numeroSocio;
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaAlta;
    private String telefono;
    private String correoElectronico;
    private Familiar[] familia;

    // Constructor con parámetros
    public Socio(String nombre, String fnacimiento, String telefono, String correoElectronico) {
        this.numeroSocio = Socio.ultimoNumeroSocio++; // Incrementar el número de socio al crear uno nuevo
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fnacimiento, f);
        this.fechaAlta = LocalDate.now();
    }

    // Getters y setters

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public static void setNumeroSocio(int numeroSocio) {
        Socio.ultimoNumeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    // Getters y setters de Familiar

    public Familiar[] getFamilia() {
        return familia;
    }

    public void setFamilia(Familiar[] familia) {
        this.familia = familia;
    }

        // to string
        @Override
        public String toString() {
            
            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            // Si un socio no tiene familiares
            if (this.familia == null) {
                return "Socio NºSocio: " + numeroSocio + " , Nombre: " + nombre + " , F.nacimiento: " + f.format(fechaNacimiento) + " , F.Alta="
                + f.format(fechaAlta) + " , Tlf: " + telefono + " , Correo Electronico:" + correoElectronico + " \nFamiliar: Sin familiares";
                }
                
                // Si un socio tiene familiares
                else {
                    return "Socio NºSocio: " + numeroSocio + "   Nombre: " + nombre + "   F.nacimiento: " + f.format(fechaNacimiento) + "   F.Alta: "
                    + f.format(fechaAlta) + "   Tlf: " + telefono + "   Correo Electronico:" + correoElectronico + " \nFamiliar: "
                    + Arrays.toString(familia) + "\n";
                    }
                    }
                    
            // método get edadd
            public int getEdad() {
                return 0;
                }
 }
