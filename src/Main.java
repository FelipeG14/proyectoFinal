//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== REGISTRO DE SUPERHEROES ===\n");

        //recién ingresa al programa de reclutas
        Heroe heroeSinAsignar = new Heroe();

        //Toda la informacion basica
        Heroe heroeVeterano = new Heroe("Marco Salgado", 45, 7.8, true);

        //Ya reclutado solo se sabe nombre
        HeroeVolador volador1 = new HeroeVolador("Ana Torres");

        //Heroe con expediente completo
        HeroeVolador volador2 = new HeroeVolador(
                "Diego Fuentes", 29, 9.2, true,
                950.5, 12000, true, 'A');

        //Conocemos parte de la informacion
        HeroeTanque tanque1 = new HeroeTanque("Camila Ríos", 34, 88, "Titanio");

        //Solo se conoce el nombre porque es nuevo recluta
        HeroeTanque tanque2 = new HeroeTanque("Julián Restrepo");

        //conocemos 3 parametros
        HeroeSigiloso sigiloso1 = new HeroeSigiloso("Valeria Muñoz", 27, 76.5);

        //aca tenemos todos los parametros del super heroe
        HeroeSigiloso sigiloso2 = new HeroeSigiloso(
                "Santiago Peña", 31, 8.9, true,
                95.0, 6, true, 'A');
    }
}