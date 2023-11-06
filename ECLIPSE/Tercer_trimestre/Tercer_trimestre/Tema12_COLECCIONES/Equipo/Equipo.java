package Equipo;

import java.util.*;

public class Equipo implements IEquipo {

    private String nombre;
    private int puntos;
    private int partidosJugados;
    private int golesFavor;
    private int golesContra;
    private SortedSet<IPartido> partidosFuera;
    private SortedSet<IPartido> partidosCasa;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.partidosJugados = 0;
        this.golesFavor = 0;
        this.golesContra = 0;
        this.partidosCasa = new TreeSet<>();
        this.partidosFuera = new TreeSet<>();
    }
    
      //GETTER Y SETTER
    public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}
    public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}
    public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
    public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
    public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
    public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}
    public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}
    public void setPartidosFuera(SortedSet<IPartido> partidosFuera) {
		this.partidosFuera = partidosFuera;
	}
    public void setPartidosCasa(SortedSet<IPartido> partidosCasa) {
		this.partidosCasa = partidosCasa;
	}
    
    // AÑADE PARTIDOS EN CASA
	@Override
    public void añadePartidosCasa(String adversario, int gFavor, int gContra, int jornada) {
        
        // Añadimos el partido al conjunto de partidos como local
        
        this.partidosCasa.add((IPartido) new Partido(this.nombre, adversario, gFavor, gContra, jornada));
    }
    
    //AÑADE PARTIDOS FUERA
    @Override
    public void añadePartidosFuera(String adversario, int gFavor, int gContra, int jornada) {
        // Añadimos el partido al conjunto de partidos como visitante
        this.partidosFuera.add((IPartido) new Partido(adversario, this.nombre, gContra, gFavor, jornada));
    }


    //RECALCULAR VALORES
    @Override
    public void recalcularValores() {
        int puntos = 0;
        int partidosGanados = 0;
        int partidosEmpatados = 0;
        int partidosPerdidos = 0;
        int golesFavor = 0;
        int golesContra = 0;
        
        // Recorremos los partidos como local
        for (IPartido partido : this.partidosCasa) {
            this.partidosJugados++;
            golesFavor += partido.getGolesLocal();
            golesContra += partido.getGolesVisitante();
            if (partido.getGolesLocal() > partido.getGolesVisitante()) {
                puntos += 3;
                partidosGanados++;
            } else if (partido.getGolesLocal() == partido.getGolesVisitante()) {
                puntos += 1;
                partidosEmpatados++;
            } else {
                partidosPerdidos++;
            }
        }
        
        // Recorremos los partidos como visitante
        for (IPartido partido : this.partidosFuera) {
            this.partidosJugados++;
            golesFavor += partido.getGolesVisitante();
            golesContra += partido.getGolesLocal();
            if (partido.getGolesVisitante() > partido.getGolesLocal()) {
                puntos += 3;
                partidosGanados++;
            } else if (partido.getGolesVisitante() == partido.getGolesLocal()) {
                puntos += 1;
                partidosEmpatados++;
            } else {
                partidosPerdidos++;
            }
        }
        
        // Actualizamos los valores de los atributos
        this.puntos = puntos;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosPerdidos = partidosPerdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
    }
    
    //COMPARE TO
    @Override
    public int compareTo(Object o) {
        IEquipo equipo = (IEquipo) o;
        if (this.puntos != equipo.getPuntos()) {
            return equipo.getPuntos() - this.puntos;
        }
        else {
            return (equipo.getGolesFavor() - equipo.getGolesContra()) - (this.golesFavor - this.golesContra);
        }
    }
    
    //GETTER Y SETTER
    @Override
	public String getNombre() {
		return null;
	}
    @Override
	public int getPuntos() {
		return 0;
	}
    @Override
	public int getPartidosJugados() {
		return 0;
	}
    @Override
	public int getGolesFavor() {
		// TODO Auto-generated method stub
		return 0;
	}
    @Override
	public int getGolesContra() {
		return 0;
	}
    @Override
	public SortedSet getPartidosFuera() {
		return null;
	}
    @Override
	public SortedSet getPartidosCasa() {
		return null;
	}
}