public class HelloUniverse {

    public static void main(String... args) {
        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";
        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";

        Atmosphere atmosphereUranus=new Atmosphere();
        atmosphereUranus.tauxHydrogene=83f;
        atmosphereUranus.tauxHelium=15f;
        atmosphereUranus.tauxMethane=2.5f;

        uranus.atmosphere=atmosphereUranus;

        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        System.out.println(jupiter.nom+" est une planète "+jupiter.matiere+" avec un diamètre de "+jupiter.diametre+" kilomètres.");

        Planete sansNom = new Planete();
        System.out.println(sansNom.nom+" est une planète "+sansNom.matiere+" avec un diamètre de "+sansNom.diametre+" kilomètres.");

        System.out.println("Neptune a effectué " +neptune.rotation(-3542)+ " tours autour de son étoile.");
        System.out.println("Mars a effectué " +mars.rotation(-684)+ " tours sur elle-même.");
        System.out.println("Venus a effectué " +venus.rotation(1250)+ " tours sur elle-même.");

        Vaisseau nouveauVaisseau = new Vaisseau();
        nouveauVaisseau.type=("FREGATE");
        nouveauVaisseau.nbPassagers=9;
        mars.accueillirVaisseau(nouveauVaisseau);
        Vaisseau autreVaisseau = new Vaisseau();
        autreVaisseau.type=("CROISEUR");
        autreVaisseau.nbPassagers=42;
        mars.accueillirVaisseau(autreVaisseau);

        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " +mars.nbTotalHumains);

        System.out.println("L'atmosphère d'Uranus est composée : ");
        System.out.println("A "+uranus.atmosphere.tauxHydrogene+"% d'hydrogène");
        System.out.println("A "+uranus.atmosphere.tauxAzote+"% d'azote");
        System.out.println("A "+uranus.atmosphere.tauxDioxyDeCarbone+"% de dioxyde de carbone");
        System.out.println("A "+uranus.atmosphere.tauxHelium+"% d'hélium");
        System.out.println("A "+uranus.atmosphere.tauxMethane+"% de méthane");
        System.out.println("A "+uranus.atmosphere.tauxSodium+"% de sodium");
        System.out.println("A "+uranus.atmosphere.tauxArgon+"% d'argon");

        System.out.println("La forme d'une planète est : " +Planete.forme);
        System.out.println("La forme de " +mars.nom+ " est : " +mars.forme);

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));
    }
}
