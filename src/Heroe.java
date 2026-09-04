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
}
