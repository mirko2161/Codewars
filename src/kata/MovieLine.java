package kata;

/**
 * See https://www.codewars.com/kata/vasya-clerk
 *
 * The new "Avengers" movie has just been released! There are a lot of people at the cinema box
 * office standing in a huge line. Each of them has a single 100, 50 or 25 dollars bill. A
 * "Avengers" ticket costs 25 dollars.
 *
 * Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this
 * line.
 *
 * Can Vasya sell a ticket to each person and give the change if he initially has no money and sells
 * the tickets strictly in the order people follow in the line?
 *
 * Return YES, if Vasya can sell a ticket to each person and give the change. Otherwise return NO.
 *
 * ###Examples:
 *
 * Line.Tickets(new int[] {25, 25, 50}) // => YES
 *
 * Line.Tickets(new int []{25, 100}) // => NO. Vasya will not have enough money to give change to
 * 100 dollars
 *
 * @author mirko
 */
public class MovieLine {

    public static String Tickets(int[] peopleInLine) {
        int[] boxOffice = new int[3]; // tracks bills 25, 50, 100 at index 0, 1, 2
        for (int personsMoney : peopleInLine) {
            switch (personsMoney) {
                case 25:
                    boxOffice[0]++;
                    break;
                case 50:
                    boxOffice[1]++;
                    if (boxOffice[0] > 0) {
                        boxOffice[0]--;
                    } else {
                        return "NO";
                    }
                    break;
                default:
                    boxOffice[2]++;
                    if (boxOffice[1] > 0 && boxOffice[0] > 1) {
                        boxOffice[1]--;
                        boxOffice[0]--;
                    } else if (boxOffice[0] > 2) {
                        boxOffice[0] -= 3;
                    } else {
                        return "NO";
                    }
                    break;
            }
        }
        return "YES";
    }

}
