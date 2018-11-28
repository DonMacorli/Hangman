package hangman;

public class Word {


    public static String replaceCharAt(String word, int index, char replace) {
        return word.substring(0, index) + replace + word.substring(index + 1);
    }

    public static boolean checkIfLetterIsOnWord(String ref,char letter){
        return (ref.contains(String.valueOf(letter)));
    }

    public static String addLetterOnWord(String userWord, String ref,char letter){
        for (int i= 0; i < ref.length(); i++){
            if (ref.charAt(i) == letter){
                userWord = replaceCharAt(userWord,i, letter);
            }
        }
        return userWord;
    }
}
