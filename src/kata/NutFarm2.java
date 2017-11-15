package kata;

/**
 * See https://www.codewars.com/kata/nut-farm-2
 *
 * For tests see the kata on the site, couldn't really write/transfer them...
 *
 * Harvesting nuts is very easy. We just shake the trees and the nuts fall out! As they fall down
 * the nuts might hit branches: Sometimes they bounce left. Sometimes they bounce right. Sometimes
 * they get stuck in the tree and don't fall out at all.
 *
 * Legend: o = a nut \ = branch. A nut hitting this branch bounces right / = branch. A nut hitting
 * this branch bounces left . = leaves, which have no effect on falling nuts | = tree trunk, which
 * has no effect on falling nuts = empty space, which has no effect on falling nuts
 *
 * Kata Task: Shake the tree and count where the nuts land.
 *
 * Output - An array (same width as the tree) which indicates how many nuts fell at each position
 *
 * Notes: The nuts may be anywhere in the canopy of the tree. Nuts do not affect the falling
 * patterns of other nuts. Falling nuts are only affected by the branches beneath them. There is not
 * always space for nuts to fall between branches. If a nut bouncing in one direction bounces
 * backwards then it will become stuck in the tree. There are no branches at the extreme left/right
 * edges of the tree so it is not possible for a nut to fall "out of bounds".
 *
 * Example
 *
 * .\..\..o//.o....\o.
 *
 * .\./\\.///....\.o\.
 *
 * .oo.\..o/\....\\o/.
 *
 * ..o.o\\//.o/.......
 *
 * .\/.\/.\.o\oo\o.oo.
 *
 * ././..//o..o..oo\o.
 *
 * .\.o\oo/\.o.o..\.\.
 *
 * .\.\..o/oo\...//...
 *
 * 0000112013052200106
 *
 * @author mirko
 */
public class NutFarm2 {

    public static int[] shakeTree(final char[][] tree) {
        int[] nutsOnGround = new int[tree[0].length];

        for (int row = 0; row < tree.length; row++) {
            outer:
            for (int column = 0; column < tree[0].length; column++) {
                if (tree[row][column] == 'o') {
                    int posOfNut = column;

                    for (int j = row + 1; j < tree.length;) {
                        switch (tree[j][posOfNut]) {
                            case '/':
                                if (tree[j][posOfNut - 1] == '\\') {
                                    continue outer; // stuck
                                }
                                posOfNut--;
                                break;
                            case '\\':
                                if (tree[j][posOfNut + 1] == '/') {
                                    continue outer; // stuck
                                }
                                posOfNut++;
                                break;
                            case '_':
                                continue outer; // stuck
                            default:
                                j++; // fall only when the path is clear
                        }
                    }
                    nutsOnGround[posOfNut]++;
                }
            }
        }
        return nutsOnGround;
    }

}
