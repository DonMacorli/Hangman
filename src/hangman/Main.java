package hangman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dictionnary dictionnary = new Dictionnary();
        dictionnary.loadDictionnary();

        System.out.println("Bienvenu au jeu pendu ! Essayez deviner le mot.");
        System.out.println("Introduiez le nb de tours : ");

        Scanner sc = new Scanner(System.in);
        int nbTours = sc.nextInt();


        while (nbTours > 0 ){
            System.out.println("Nombre des tours restantes : " + nbTours);
            sc.useDelimiter("");
            String lettre = sc.next();
            nbTours--;
        }

    }
}
