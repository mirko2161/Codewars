package kata;

/**
 * See https://www.codewars.com/kata/bit-counting
 *
 * Write a function that takes an (unsigned) integer as input, and returns the number of bits that
 * are equal to one in the binary representation of that number.
 *
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in
 * this case
 *
 * @author mirko
 */
public class BitCounting {

    public static int countBits(int num) {

        String stringNum = Integer.toBinaryString(num);
        int total = 0;
        for (int i = 0; i < stringNum.length(); i++) {
            if (stringNum.charAt(i) == '1') {
                total++;
            }
        }
        return total;
        // apparently you can just do return Integer.bitCount(num);
    }

}
