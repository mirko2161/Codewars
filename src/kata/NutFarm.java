package kata;

/**
 * See https://www.codewars.com/kata/nut-farm
 *
 * For test see the kata on the site, couldn't really write/transfer them...
 *
 * As they fall down the nuts might hit branches: Sometimes they bounce left. Sometimes they bounce
 * right. Sometimes they get stuck in the tree and don't fall out at all.
 *
 * Legend: o = a nut \ = branch. A nut hitting this branch bounces right / = branch. A nut hitting
 * this branch bounces left _ = branch. A nut hitting this branch gets stuck in the tree . = leaves,
 * which have no effect on falling nuts | = tree trunk, which has no effect on falling nuts = empty
 * space, which has no effect on falling nuts
 *
 * Shake the tree and count where the nuts land. Output - An array (same width as the tree) which
 * indicates how many nuts fell at each position ^
 *
 * Notes: The nuts are always found at the top of the tree Nuts do not affect the falling patterns
 * of other nuts There are always enough spaces for nuts to fall between branches There are no
 * branches at the extreme left/right edges of the tree matrix so it is not possible for a nut to
 * fall "out of bounds"
 *
 * @author mirko
 */
public class NutFarm {

    public static int[] shakeTree(final char[][] tree) {
        int[] nutsOnGround = new int[tree[0].length];
        outer:
        for (int i = 0; i < tree[0].length; i++) {
            if (tree[0][i] == 'o') {
                int posOfNut = i;

                for (int j = 1; j < tree.length; j++) {
                    switch (tree[j][posOfNut]) {
                        case '/':
                            posOfNut--;
                            break;
                        case '\\':
                            posOfNut++;
                            break;
                        case '_':
                            continue outer;
                    }
                }
                nutsOnGround[posOfNut]++;
            }
        }
        return nutsOnGround;
    }

}
