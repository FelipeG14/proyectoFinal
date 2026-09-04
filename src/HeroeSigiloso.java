public class HeroeSigiloso extends Heroe {

    // 4 atributos propios, de tipos diferentes entre sí
    private double nivelInvisibilidad;
    private int numArmasSecretas;
    private boolean usaGadgets;
    private char rangoSigilo;
    /**
     * Constructor de solo nombre
     */
    public HeroeSigiloso(String nombreReal) {
        super(nombreReal);
        this.nivelInvisibilidad = 10.0;
        this.numArmasSecretas = 1;
        this.usaGadgets = false;
        this.rangoSigilo = 'C';
    }

    /**
     * Constructor con dos datos heredados
     */
    public HeroeSigiloso(String nombreReal, int edad, double nivelInvisibilidad) {
        super(nombreReal, edad);
        this.nivelInvisibilidad = nivelInvisibilidad;
        this.numArmasSecretas = 3;
        this.usaGadgets = true;
        this.rangoSigilo = 'B';
    }

    /**
     * Constructor completo
     */
    public HeroeSigiloso(String nombreReal, int edad, double poderNivel, boolean esActivo,
                         double nivelInvisibilidad, int numArmasSecretas,
                         boolean usaGadgets, char rangoSigilo) {
        super(nombreReal, edad, poderNivel, esActivo);
        this.nivelInvisibilidad = nivelInvisibilidad;
        this.numArmasSecretas = numArmasSecretas;
        this.usaGadgets = usaGadgets;
        this.rangoSigilo = rangoSigilo;
    }

    // Getters y setters

    public double getNivelInvisibilidad() {
        return nivelInvisibilidad;
    }

    public void setNivelInvisibilidad(double nivelInvisibilidad) {
        this.nivelInvisibilidad = nivelInvisibilidad;
    }

    public int getNumArmasSecretas() {
        return numArmasSecretas;
    }

    public void setNumArmasSecretas(int numArmasSecretas) {
        this.numArmasSecretas = numArmasSecretas;
    }

    public boolean isUsaGadgets() {
        return usaGadgets;
    }

    public void setUsaGadgets(boolean usaGadgets) {
        this.usaGadgets = usaGadgets;
    }

    public char getRangoSigilo() {
        return rangoSigilo;
    }

    public void setRangoSigilo(char rangoSigilo) {
        this.rangoSigilo = rangoSigilo;
    }

    // toString

    @Override
    public String toString() {
        return "HeroeSigiloso { " + super.toString() +
                ", nivelInvisibilidad=" + nivelInvisibilidad +
                ", numArmasSecretas=" + numArmasSecretas +
                ", usaGadgets=" + usaGadgets +
                ", rangoSigilo=" + rangoSigilo + " }";
    }
}
