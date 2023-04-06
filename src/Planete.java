public class Planete {

    static String forme = "Sphérique";
    static int nbPlanetesDecouvertes=0;

    String nom;
    long diametre;
    int nbTotalHumains;
    int totalVisiteurs;

    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAccoste;

    Planete(String nom){
        this.nom=nom;
        nbPlanetesDecouvertes++;
    }

    int revolution(int angle){
        return angle/360;
    }
    int rotation(int angle){
        return angle/360;
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

