public class BubbleSortExample {
    public static void bubbleSort(int[] scores) {
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < (3 - i); j++) {
                if (scores[j - 1] > scores[j]) {

                    temp = scores[j - 1];
                    scores[j - 1] = scores[j];
                    scores[j] = temp;
                }
            }
        }

    }
}