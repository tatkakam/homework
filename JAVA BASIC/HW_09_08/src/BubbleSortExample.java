public class BubbleSortExample {
    public static void bubbleSort(int[] scores, String[] firstNames, String[] lastNames) {
        int temp = 0;
        String fn;
        String ln;
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < (3 - i); j++) {
                if (scores[j - 1] > scores[j]) {

                    temp = scores[j - 1];
                    scores[j - 1] = scores[j];
                    scores[j] = temp;

                    fn = firstNames[j - 1];
                    firstNames[j - 1] = firstNames[j];
                    firstNames[j] = fn;

                    ln = lastNames[j - 1];
                    lastNames[j - 1] = lastNames[j];
                    lastNames[j] = ln;
                }
            }
        }

    }
}
