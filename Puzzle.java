import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
    private String word; //represents the random word the user is supposed to guess
    //stored as all uppercase letters

    private String guesses; //represents all the letters that the user has guessed.
    //If the user has guessed the letters r, s, t and e, then
    //guesses would refer to the String "RSTE"

    private int MAX_WORDS = 45402; //represents how many words are in words.txt

    public Puzzle() {
        //loading text from a file using the Scanner (not on AP exam)
        word = pickRandomWord("C:\\Users\\non3c\\IdeaProjects\\Hangman\\src\\words.txt");
        guesses = "";
    }

    private String pickRandomWord(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            int i = 0;
            int n = (int) (Math.random() * MAX_WORDS);
            String line = "";
            while (i < n) {
                line = scanner.next();
                i++;
            }
            scanner.close();
            return line.toUpperCase();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    //If the guess String is length one, add it to the list of to guesses and return
    //true or false if that letter is in our word to be guessed.
    //If the guess String is longer than length one, check to see if it is the word
    //to be guessed. If it is, add guess to guesses and return true, else return false
    public boolean makeGuess(String guess) {
        guess = guess.toUpperCase();
        if (guess.length() == 1) guesses += guess;
        else if (guess.equals(word)) {guesses += guess; return true;}
        else return false;
        return word.contains(guess);
    }

    //Display the word to be guessed letter by letter using a loop. If the letter has
    //been guessed, print that letter. If not, print and underscore character (_) instead.
    //On a different line, show all the letters that have been guessed so far.
    public void show() {
        for (int i = 0; i < word.length(); i ++) {
            if (guesses.contains(word.substring(i, i+1))) System.out.print(word.charAt(i));
            else System.out.print("_");
        }
        System.out.println();
        System.out.println("Guessed Letters: " + guesses);
    }

    //Return true or false if the word has been guessed or not (ie: all of the letters in
    //word are also in guesses.
    public boolean isUnsolved() {
        for (int i = 0; i < word.length(); i ++) {
            if (!guesses.contains(word.substring(i, i+1))) return true;
        }
        return false;
    }

    //returns word;
    public String getWord() {
        return word;
    }
}
