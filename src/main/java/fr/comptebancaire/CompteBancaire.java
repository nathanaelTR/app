package fr.comptebancaire;

public class CompteBancaire {

    private int solde;
    private String propriétaire;

    public CompteBancaire(String propriétaire, int soldeInitial) {
        this.propriétaire = propriétaire;
        this.solde = soldeInitial;
    }

    public void retirer(int somme) {

        if (solde >= somme) {
            solde = solde - somme;
        } else {
            System.out.println("Votre solde est inférieur au montant retirer !");
        }

    }

    public void ajouter(int somme) {
        solde = somme + solde;
    }

    public String getinfos() {
        return "[Propriétaire] : " + propriétaire + " / [Solde] : " + solde;
    }

}
