package Pattren;
/*
1
121
12321
1234321
123454321
 */

public class Pattern42 {
    public static void main(String[] args) {
        int end = 1;
        for (int i = 1; i <= 5; i++) {
            int x = 1;
            for (int j = 1; j <= end; j++) {
                System.out.print(x);
                if (j < i) {
                    x++;
                } else {
                    x--;
                }

            }
            System.out.println();
            end = end + 2;

        }
    }

}
