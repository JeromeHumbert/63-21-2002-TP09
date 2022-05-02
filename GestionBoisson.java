import java.io.File;

public class GestionBoisson {

    public GestionBoisson(){}

    public void chargerData(String path){

    }



    public static void main(String[] args){
        GestionBoisson gB = new GestionBoisson();
        String localDir = System.getProperty("user.dir");
        gB.chargerData(localDir + File.separator +"erreur_stock.csv"); // Ne pas supprimer
        gB.chargerData(localDir + File.separator +"stock.csv");
        gB.afficherStock();
        System.out.println();
        Boisson b = new Chocolat("Chocolat",1.5, 25,"au lait");
        try {
            gB.servirProduit(b);
            gB.servirProduit(b);
            gB.servirProduit(b);
        }catch (QuantiteException qE){
            System.out.println(qE);
        }
        System.out.println();
        gB.afficherStock();

    }
}
