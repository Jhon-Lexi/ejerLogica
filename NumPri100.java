
public class NumPri100 {
    public static void main(String[] ja) {
        int n = 100, i, j;

        for (j = 2; j <= n; j++) {
            i = 2;
            while (j % i != 0) {
                i++;
            }
            if (i == j) {
                System.out.println(j);
            }
        }
    }
}
