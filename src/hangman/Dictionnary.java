package hangman;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Dictionnary {

    ArrayList<String> listOfWords;

    String fileName = "C:\\Users\\Administrateur\\IdeaProjects\\Pendu\\src\\dictionaries\\liste_francais.txt";

    public Dictionnary(){
        listOfWords = new ArrayList<>();
    }

    public void loadDictionnary(){
        listOfWords.clear();
        try (Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.ISO_8859_1)) {
            stream.forEach(listOfWords::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
