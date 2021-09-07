package org.example;

public class Facture {

    public Facture() {

    }

    public void ajouterElementFacture(ElementFacture el) {
        elements.ajouter(el);
    }

    public double getTotal(){
        double total = 0;
        for(int i = 0; i < elements.taille(); ++i) {
            ElementFacture el = (ElementFacture)elements.get(i);
            total += el.prixTotal();
        }
        return total;
    }

    public ListeChainee getElementsFacture() {
        return elements;
    }

    private ListeChainee elements = new ListeChainee();

}
