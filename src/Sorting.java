public class Sorting {
    public static void main(String[] args) {
        Integer[] m = {13, 9, 17, 21, 3, 67, 32};
        for (int i = 0; i < m.length; i++) {
            int num = m[i];

            for (int j = i - 1; j >= 0; j--) {
                int leftNumber = m[j];

                if (num < leftNumber) {
                    m[j + 1] = leftNumber;
                    m[j] = num;
                } else {
                    break;
                }
            }
        }
        for (Integer n : m) {
            System.out.println(n + " ");
        }
    }
}