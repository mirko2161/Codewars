package kata;

/**
 * See https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
 *
 * Given a string of words, you need to find the highest scoring word. Each letter of a word scores
 * points according to it's position in the alphabet: a = 1, b = 2, c = 3 etc. You need to return
 * the highest scoring word as a string.
 *
 * If two words score the same, return the word that appears earliest in the original string. All
 * letters will be lowercase and all inputs will be valid.
 *
 * @author mirko
 */
public class HighestScoringWord {

    public static String high(String stringOfWords) {
        String highscoreWord = "";
        int maxTotal = 0;

        for (String word : stringOfWords.split(" ")) {
            int totalOfWord = 0;
            for (char c : word.toCharArray()) {
                totalOfWord += c - 96; // the int value of "a" is 97
            }
            if (totalOfWord > maxTotal) {
                maxTotal = totalOfWord;
                highscoreWord = word;
            }
        }
        return highscoreWord;
    }

}
