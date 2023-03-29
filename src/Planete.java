public class Planete {
    String nom;
    String matiere;
    long diametre;
    int nbTotalHumains;


    int revolution(int angle){
        return angle/360;
    }
    int rotation(int angle){
        return angle/360;
    }

    void accueillirVaisseau(int nbHumains){
        nbTotalHumains=nbTotalHumains+nbHumains;
    }

    void accueillirVaisseau(String typeVaisseau){
        if (typeVaisseau.equals("CHASSEUR")){
            nbTotalHumains=nbTotalHumains+3;
        }
        else if (typeVaisseau.equals("FREGATE")) {
            nbTotalHumains=nbTotalHumains+12;
        }
        else if (typeVaisseau.equals("CROISEUR")) {
            nbTotalHumains=nbTotalHumains+50;
        }
    }
}

