package org.example;

public class ElementFacture {

    public ElementFacture(String nom, int qt, double prixUnitaire) {
        this.nom = nom;
        this.qt = qt;
        this.prixUnitaire = prixUnitaire;
    }

    public String getNom() {
        return nom;
    }

    public int getQt() {
        return qt;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public double prixTotal() { return qt * prixUnitaire; }

    public String toString() {
        return String.format("%d x %s @ %.2f\t\t = %.2f", qt, nom, prixUnitaire, prixTotal());
    }

    private String nom;
    private int qt;
    private double prixUnitaire;

}
