public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {
            "+----+\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "/\\\n",

            "+----+\n" +
                    "|    O\n" +
                    "|\n" +
                    "|\n" +
                    "/\\\n",

            "+----+\n" +
                    "|    O\n" +
                    "|    +\n" +
                    "|\n" +
                    "/\\\n",

            "+----+\n" +
                    "|    O\n" +
                    "|    +-\n" +
                    "|\n" +
                    "/\\\n",

            "+----+\n" +
                    "|    O\n" +
                    "|   -+-\n" +
                    "|\n" +
                    "/\\\n",

            "+----+\n" +
                    "|    O\n" +
                    "|   -+-\n" +
                    "|   / \n" +
                    "/\\\n",

            "+----+\n" +
                    "|    O\n" +
                    "|   -+-\n" +
                    "|   / \\\n" +
                    "/\\\n",
    };

    //Constructor - intializes numWrongGuesses to zero
    public HangingMan() {
        numWrongGuesses = 0;
    }

    //increments numWrongGuesses by one
    public void dieSomeMore() {
        numWrongGuesses ++;
    }

    //returns true if numWrongGuesses is 6, false othewise
    public boolean isntDead() {
        return !(numWrongGuesses == 6);
    }

    //prints to the console the String stored in the HangmanImage array
    //at the index equal to numWrongGuess
    public void show() {
        System.out.println(HangmanImage[numWrongGuesses]);
    }

}


