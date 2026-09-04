public class HeroeVolador extends Heroe{

    // 4 atributos propios, de tipos diferentes entre sí
    private double velocidadMaxima;
    private int altitudMaxima;
    private boolean puedeCargarPasajeros;
    private char clasificacionVuelo;

    /**
     * Constructor de solo nombre
     */
    public HeroeVolador(String nombreReal) {
        super(nombreReal);
        this.velocidadMaxima = 0.0;
        this.altitudMaxima = 0;
        this.puedeCargarPasajeros = false;
        this.clasificacionVuelo = 'C';
    }

    /**
     * Constructor con dos datos heredados
     */
    public HeroeVolador(String nombreReal, int edad, double velocidadMaxima) {
        super(nombreReal, edad);
        this.velocidadMaxima = velocidadMaxima;
        this.altitudMaxima = 1000;
        this.puedeCargarPasajeros = false;
        this.clasificacionVuelo = 'B';
    }

    /**
     * Constructor completo
     */
    public HeroeVolador(String nombreReal, int edad, double poderNivel, boolean esActivo,
                        double velocidadMaxima, int altitudMaxima,
                        boolean puedeCargarPasajeros, char clasificacionVuelo) {
        super(nombreReal, edad, poderNivel, esActivo);
        this.velocidadMaxima = velocidadMaxima;
        this.altitudMaxima = altitudMaxima;
        this.puedeCargarPasajeros = puedeCargarPasajeros;
        this.clasificacionVuelo = clasificacionVuelo;
    }

    // Getters y setters

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(int altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public boolean isPuedeCargarPasajeros() {
        return puedeCargarPasajeros;
    }

    public void setPuedeCargarPasajeros(boolean puedeCargarPasajeros) {
        this.puedeCargarPasajeros = puedeCargarPasajeros;
    }

    public char getClasificacionVuelo() {
        return clasificacionVuelo;
    }

    public void setClasificacionVuelo(char clasificacionVuelo) {
        this.clasificacionVuelo = clasificacionVuelo;
    }

    // toString

    @Override
    public String toString() {
        return "HeroeVolador { " + super.toString() +
                ", velocidadMaxima=" + velocidadMaxima +
                ", altitudMaxima=" + altitudMaxima +
                ", puedeCargarPasajeros=" + puedeCargarPasajeros +
                ", clasificacionVuelo=" + clasificacionVuelo + " }";
    }
}
