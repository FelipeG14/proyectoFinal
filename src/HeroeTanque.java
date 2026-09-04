public class HeroeTanque extends Heroe {

    // 4 atributos propios, de tipos diferentes entre sí
    private int nivelResistencia;
    private double pesoArmadura;
    private boolean tieneEscudo;
    private String materialArmadura;

    /**
     * Constructor de solo nombre
     */
    public HeroeTanque(String nombreReal) {
        super(nombreReal);
        this.nivelResistencia = 50;
        this.pesoArmadura = 0.0;
        this.tieneEscudo = false;
        this.materialArmadura = "Desconocido";
    }

    /**
     * Constructor con dos datos heredados
     */
    public HeroeTanque(String nombreReal, int edad, int nivelResistencia, String materialArmadura) {
        super(nombreReal, edad);
        this.nivelResistencia = nivelResistencia;
        this.pesoArmadura = 100.0;
        this.tieneEscudo = true;
        this.materialArmadura = materialArmadura;
    }

    /**
     * Constructor completo
     */
    public HeroeTanque(String nombreReal, int edad, double poderNivel, boolean esActivo,
                       int nivelResistencia, double pesoArmadura,
                       boolean tieneEscudo, String materialArmadura) {
        super(nombreReal, edad, poderNivel, esActivo);
        this.nivelResistencia = nivelResistencia;
        this.pesoArmadura = pesoArmadura;
        this.tieneEscudo = tieneEscudo;
        this.materialArmadura = materialArmadura;
    }

    // Getters y setters propios

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public double getPesoArmadura() {
        return pesoArmadura;
    }

    public void setPesoArmadura(double pesoArmadura) {
        this.pesoArmadura = pesoArmadura;
    }

    public boolean isTieneEscudo() {
        return tieneEscudo;
    }

    public void setTieneEscudo(boolean tieneEscudo) {
        this.tieneEscudo = tieneEscudo;
    }

    public String getMaterialArmadura() {
        return materialArmadura;
    }

    public void setMaterialArmadura(String materialArmadura) {
        this.materialArmadura = materialArmadura;
    }

    // toString

    @Override
    public String toString() {
        return "HeroeTanque { " + super.toString() +
                ", nivelResistencia=" + nivelResistencia +
                ", pesoArmadura=" + pesoArmadura +
                ", tieneEscudo=" + tieneEscudo +
                ", materialArmadura='" + materialArmadura + "' }";
    }
}
