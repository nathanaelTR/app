package fr.comptebancaire;

public class App {

    public static void main(String[] args) {
        CompteBancaire Compte = new CompteBancaire("john", 1000);

        System.out.println(Compte.getinfos());

        Compte.retirer(600);

        System.out.println(Compte.getinfos());

        Compte.ajouter(150);

        System.out.println(Compte.getinfos());

        Compte.retirer(600);

        System.out.println(Compte.getinfos());
    }
}
