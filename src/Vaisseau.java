public class Vaisseau {
    String type;
    int nbPassagers;

    int blindage;
    int resistanceDuBouclier;

    String activerBouclier(){
        return "Activation du bouclier d'un vaisseau de type" +type;
    }

    String desactiverBouclier(){
        return "Désactivation du bouclier d'un vaisseau de type" +type;
    }
}
