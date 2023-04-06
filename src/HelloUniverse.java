public class HelloUniverse {

    public static void main(String... args) {
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Vénus");
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;

        Atmosphere atmosphereUranus=new Atmosphere();
        atmosphereUranus.tauxHydrogene=83f;
        atmosphereUranus.tauxHelium=15f;
        atmosphereUranus.tauxMethane=2.5f;

        uranus.atmosphere=atmosphereUranus;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");

        neptune.diametre = 49532;

        System.out.println(jupiter.nom+" est une planète avec un diamètre de "+jupiter.diametre+" kilomètres.");

        System.out.println("Neptune a effectué " +neptune.rotation(-3542)+ " tours autour de son étoile.");
        System.out.println("Mars a effectué " +mars.rotation(-684)+ " tours sur elle-même.");
        System.out.println("Venus a effectué " +venus.rotation(1250)+ " tours sur elle-même.");

        Vaisseau nouveauVaisseau = new Vaisseau();
        nouveauVaisseau.type=("FREGATE");
        nouveauVaisseau.nbPassagers=9;

        Vaisseau autreVaisseau = new Vaisseau();
        autreVaisseau.type=("CROISEUR");
        autreVaisseau.nbPassagers=42;

        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " +mars.nbTotalHumains);

        System.out.println("L'atmosphère d'Uranus est composée : ");
        System.out.println("A "+uranus.atmosphere.tauxHydrogene+"% d'hydrogène");
        System.out.println("A "+uranus.atmosphere.tauxAzote+"% d'azote");
        System.out.println("A "+uranus.atmosphere.tauxDioxydeDeCarbone+"% de dioxyde de carbone");
        System.out.println("A "+uranus.atmosphere.tauxHelium+"% d'hélium");
        System.out.println("A "+uranus.atmosphere.tauxMethane+"% de méthane");
        System.out.println("A "+uranus.atmosphere.tauxSodium+"% de sodium");
        System.out.println("A "+uranus.atmosphere.tauxArgon+"% d'argon");

        System.out.println("La forme d'une planète est : " +Planete.forme);
        System.out.println("La forme de " +mars.nom+ " est : " +mars.forme);

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

        System.out.println("Le nombre de planètes découvertes est actuellement de " +Planete.nbPlanetesDecouvertes);

        VaisseauDeGuerre chasseur=new VaisseauDeGuerre();
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;
        chasseur.type="CHASSEUR";

        VaisseauCivil vaisseauMonde=new VaisseauCivil();
        vaisseauMonde.blindage=4784;
        vaisseauMonde.resistanceDuBouclier=30;
        vaisseauMonde.type="VAISSEAU-MONDE";
        vaisseauMonde.activerBouclier();

        chasseur.activerBouclier();
        chasseur.attaque(vaisseauMonde, "lasers photoniques", 3);
        vaisseauMonde.desactiverBouclier();
        System.out.println("La résistance du bouclier du VM est " +vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage du VM est " +vaisseauMonde.blindage);

        mars.accueillirVaisseau(vaisseauMonde);

        mars.accueillirVaisseau(chasseur);
    }
}
