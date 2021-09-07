package org.example;

import junit.framework.TestCase;

import org.junit.Test;

public class ListeChaineeTest extends TestCase {

    @Test
    public void testListe(){

        ListeChainee l1 = new ListeChainee();
        assertEquals(0, l1.taille());

        l1.ajouter(new Integer(0));
        assertEquals(1, l1.taille());
        assertEquals(new Integer(0), (Integer)l1.get(0));

        l1.ajouter(new Integer(1));
        assertEquals(2, l1.taille());
        assertEquals(new Integer(0), (Integer)l1.get(0));
        assertEquals(new Integer(1), (Integer)l1.get(1));

        l1.ajouter(new Integer(2));
        assertEquals(3, l1.taille());
        assertEquals(new Integer(0), (Integer)l1.get(0));
        assertEquals(new Integer(1), (Integer)l1.get(1));
        assertEquals(new Integer(2), (Integer)l1.get(2));
    }

}