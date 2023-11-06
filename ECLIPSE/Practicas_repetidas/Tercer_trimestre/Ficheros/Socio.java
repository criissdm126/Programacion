package Ficheros;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Socio implements Serializable {

    private static final long serialVersionUID = 1L; // controla la compatibilidad de versiones en la serialización de objetos
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
     // crea un objeto de la clase DateTimeFormatter que se utiliza para formatear y analizar fechas en un formato específico.
        
        this.fechaNacimiento = LocalDate.parse(fnacimiento, f); // asigna a la variable fechaNacimiento un valor de tipo LocalDate
        //  parse()  para convertir la cadena fnacimiento en un objeto LocalDate
        
        this.fechaAlta = LocalDate.now(); //  asigna a la variable fechaAlta el valor actual de la fecha como un objeto LocalDate
        // now() de la clase LocalDate para obtener la fecha actual del sistema.
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
            
            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // crea un objeto DateTimeFormatter
            // se utiliza para formatear y analizar fechas en el patrón especificado
            

            if (this.familia == null) { // Si un socio no tiene familiares
                return "Socio numero:  " + numeroSocio + " , Nombre: " + nombre + " , F.nacimiento: " + f.format(fechaNacimiento) + " , F.Alta="
                + f.format(fechaAlta) + " , Tlf: " + telefono + " , Correo Electronico:" + correoElectronico + " \nFamiliar: Sin familiares";
                }
                
            else { // SIN FAMILIARES
                String familiarString = "Nombre: ";
                if (familia.length > 0) {
                    for (int i = 0; i < familia.length; i++) {
                        familiarString = familiarString + familia[i].getNombre();
                        if (i != familia.length - 1) {
                            familiarString += " || ";
                        }
                    }
                }
                
                else {
                    familiarString += "Sin familiares";
                }

                return "Socio numero: " + numeroSocio + "   Nombre: " + nombre + "   F.nacimiento: " + f.format(fechaNacimiento) + "   F.Alta: "
                        + f.format(fechaAlta) + "   Tlf: " + telefono + "   Correo Electronico: " + correoElectronico + " \nFamiliar: "
                        + familiarString + "\n";
            }
        }
              /*  else {// Si un socio tiene familiares
                    return "Socio numero: " + numeroSocio + "   Nombre: " + nombre + "   F.nacimiento: " + f.format(fechaNacimiento) + "   F.Alta: "
                    + f.format(fechaAlta) + "   Tlf: " + telefono + "   Correo Electronico: " + correoElectronico + " \nFamiliar: "
                    + Arrays.toString(familia) + "\n";
				}
			}*/
        
			// método get edad
        
            public int getEdad() {
                return 0;
			}

		}
