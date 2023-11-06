package T3_COLECCIONES_PARTE1_V2;

class Alimento implements Saludable, Comparable<Alimento> {
    private String tipo;
    private int calorias;
    
    public Alimento(String tipo, int calorias) {
        this.tipo = tipo;
        this.calorias = calorias;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public int getCalorias() {
        return calorias;
    }
    
    @Override
    public int compareTo(Alimento o) {
        if (this.calorias != o.calorias) {
            return this.calorias - o.calorias;
        } else {
            return this.tipo.compareTo(o.tipo);
        }
    }
    
    public String toString() {
        return this.tipo+this.calorias;
    }
}