public class Heroe {
    // 4 atributos de tipos de datos diferentes entre sí
    private String nombreReal;
    private int edad;
    private double poderNivel;
    private boolean esActivo;

    public Heroe() {
        this("Héroe sin identidad asignada");
    }

    /**
     * Constructor de 1 parámetro
     */
    public Heroe(String nombreReal) {
        this(nombreReal, 18);
    }

    /**
     * Constructor de 2 parámetros
     */
    public Heroe(String nombreReal, int edad) {
        this(nombreReal, edad, 1.0, true);
    }

    /**
     * Constructor completo
     */
    public Heroe(String nombreReal, int edad, double poderNivel, boolean esActivo) {
        this.nombreReal = nombreReal;
        this.edad = edad;
        this.poderNivel = poderNivel;
        this.esActivo = esActivo;
    }
    // Getters y setters

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPoderNivel() {
        return poderNivel;
    }

    public void setPoderNivel(double poderNivel) {
        this.poderNivel = poderNivel;
    }

    public boolean isEsActivo() {
        return esActivo;
    }

    public void setEsActivo(boolean esActivo) {
        this.esActivo = esActivo;
    }
    // toString
    @Override
    public String toString() {
        return "Heroe { nombreReal='" + nombreReal + "'" +
                ", edad=" + edad +
                ", poderNivel=" + poderNivel +
                ", esActivo=" + esActivo + " }";
    }
}
