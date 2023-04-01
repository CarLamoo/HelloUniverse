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

    static String expansion(double distance){
        if(distance<14){
            return "Oh la la mais c'est super rapide !";
        }
        else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }
}

