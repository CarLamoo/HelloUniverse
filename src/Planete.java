public class Planete {
    String nom;
    String matiere;
    long diametre;
    int nbTotalHumains;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAcoste;
    static String forme = "Sphérique";


    int revolution(int angle){
        return angle/360;
    }
    int rotation(int angle){
        return angle/360;
    }

    Vaisseau accueillirVaisseau(Vaisseau vaisseau){
        nbTotalHumains=nbTotalHumains+vaisseau.nbPassagers;
        if (vaisseauActuellementAcoste==null){
            System.out.println("Aucun vaisseau ne s'en va.");
        }
        else {
            System.out.println("Un vaisseau de type "+vaisseauActuellementAcoste.type+" doit s'en aller.");
        }
        Vaisseau vaisseauPrecedent=vaisseauActuellementAcoste;
        vaisseauActuellementAcoste=vaisseau;
        return vaisseauPrecedent;
    }

}

