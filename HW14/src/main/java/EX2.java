import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EX2 {
    static boolean checkForSomeNumbers(int[] ints) {
        final int numbers[] = new int[]{1, 4};
        boolean contain1 = false;
        boolean contain4 = false;
        for (int x = 0; x <= ints.length - 1; x++) {
            if (ints[x] == numbers[0]) {
                contain1 = true;
            } else if (ints[x] == numbers[1]) {
                contain4 = true;
            }

            if (ints[x] != numbers[0] && ints[x] != numbers[1]) {
                return false;
            }

        }

        return contain1 && contain4;
    }
}
