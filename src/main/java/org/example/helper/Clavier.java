package org.example.helper;

import java.io.*;

public class Clavier {

    // Retourne une ligne de texte provenant de stdin. Si une ligne n'est pas présentement en mémoire, la fonction
    // bloque jusqu'à ce que l'utilisateur en entre une.
    // La ligne ne contient pas les charactères de saut de ligne(\n\r)
    public static String lireLigne() {
        return instance()._lireLigne();
    }

    // Lit une ligne de texte de stdin et la tamponne en mémoire. Retourne les characteres 1 à la fois.
    public static char lireChar() {
        return instance()._lireChar();
    }

    // Lit une ligne de texte de stdin et la tamponne en mémoire. Retourne un mot à la fois.
    public static String lireMot() {
        return instance()._lireMot();
    }

   private static Clavier singletonInstance = null;

   private BufferedReader reader = null;

   private Clavier(InputStream is) {
        reader = new BufferedReader( new InputStreamReader(new BufferedInputStream( is )));
   }

   private char _lireChar(){
       try {
           char[] bfr = new char[1];
           reader.read(bfr);
           return bfr[0];
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

   private String _lireLigne(){
       try {
           return reader.readLine().trim();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }

    private String _lireMot(){
        String mot = "";

        char curChar = ' ';
        while(Character.isWhitespace(curChar)) {
            curChar = _lireChar();
        }

        while(!Character.isWhitespace(curChar)){
            mot += curChar;
            curChar = _lireChar();
        }

        return mot;
    }

   private static Clavier instance() {
       if(singletonInstance == null) singletonInstance = new Clavier(System.in);
       return singletonInstance;
   }
}
