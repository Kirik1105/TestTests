import java.util.Arrays;

public class EX1 {
    public static void main(String[] args) {
        final int[] ints = {1, 2, 3, 3, 2, 4, 1, 3, 5};
        System.out.println(Arrays.toString(createNewArrayAfterNum(ints)));
    }

    static int[] createNewArrayAfterNum(int[] ints) {
        final int num = 4;
        int numPlace;
        if (ints == null) {
            throw new RuntimeException("Array is empty");
        }
        for (numPlace = ints.length - 1; numPlace >= 0; numPlace--) {
            if (ints[numPlace] == num) {
                break;
            }

        }
        if (numPlace == -1) {
            throw new RuntimeException("No " + num + "in this array");
        }
        int[] newInts = new int[ints.length - 1 - numPlace];
        for (int x = ints.length - 1, y = newInts.length - 1; x > numPlace; x--, y--) {

            newInts[y] = ints[x];

        }
        return newInts;
    }

}
