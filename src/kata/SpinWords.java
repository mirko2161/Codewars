package kata;

/**
 * See https://www.codewars.com/kata/stop-gninnips-my-sdrow
 *
 * Write a function that takes in a string of one or more words, and returns the same string, but
 * with all five or more letter words reversed (Just like the name of this Kata). Strings passed in
 * will consist of only letters and spaces. Spaces will be included only when more than one word is
 * present.
 *
 * Examples:
 *
 * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 *
 * spinWords( "This is a test") => returns "This is a test"
 *
 * spinWords( "This is another test" )=> returns "This is rehtona test"
 *
 * @author mirko
 */
public class SpinWords {

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }

}
