//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== REGISTRO DE SUPERHEROES ===\n");

        /**
         * objetos de la super clase
         */

        //recién ingresa al programa de reclutas
        Heroe heroeSinAsignar = new Heroe();

        //Toda la informacion basica
        Heroe heroeVeterano = new Heroe("Marco Salgado", 45, 7.8, true);

        /**
         * objetos de la clase HeroeVolador
         */

        //Ya reclutado solo se sabe nombre
        HeroeVolador volador1 = new HeroeVolador("Ana Torres");

        //Heroe con expediente completo
        HeroeVolador volador2 = new HeroeVolador(
                "Diego Fuentes", 29, 9.2, true,
                950.5, 12000, true, 'A');

        /**
         * objetos de la clase HeroeTanque
         */

        //Conocemos parte de la informacion
        HeroeTanque tanque1 = new HeroeTanque("Camila Ríos", 34, 88, "Titanio");

        //Solo se conoce el nombre porque es nuevo recluta
        HeroeTanque tanque2 = new HeroeTanque("Julián Restrepo");

        /**
         * objetos de la clase HeroeSigiloso
         */

        //conocemos 3 parametros
        HeroeSigiloso sigiloso1 = new HeroeSigiloso("Valeria Muñoz", 27, 76.5);

        //aca tenemos todos los parametros del super heroe
        HeroeSigiloso sigiloso2 = new HeroeSigiloso(
                "Santiago Peña", 31, 8.9, true,
                95.0, 6, true, 'A');

        // Impresión de todos los objetos usando toString()

        System.out.println("-- Héroes generales --");
        System.out.println(heroeSinAsignar);
        System.out.println(heroeVeterano);

        System.out.println("\n-- Héroes voladores --");
        System.out.println(volador1);
        System.out.println(volador2);

        System.out.println("\n-- Héroes tanque --");
        System.out.println(tanque1);
        System.out.println(tanque2);

        System.out.println("\n-- Héroes sigilosos --");
        System.out.println(sigiloso1);
        System.out.println(sigiloso2);
    }
}