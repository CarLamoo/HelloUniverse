public class PlaneteTellurique extends Planete implements Habitable{
    public PlaneteTellurique(String nom) {
        super(nom);
    }
    public Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau){

        totalVisiteurs+=nouveauVaisseau.nbPassagers;

        Vaisseau vaisseauPrecedent=vaisseauAccoste;

        vaisseauAccoste=nouveauVaisseau;

        return vaisseauPrecedent;
    }
}
