public class App {
    public static void main(String[] args) throws Exception {

        int[][] mdArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        int i, j;
        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0;

        // PATTERN 1
        System.out.println("1. SUM OF PATTERN 1");

        for (i = 0; i < mdArray.length; i++) {
            sum1 += mdArray[i / mdArray.length][i % mdArray.length];
        }
        System.out.println("The sum is " + sum1);

        // PATTERN 2
        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2");
        for (i = 0; i < mdArray.length; i++) {
            sum2 += mdArray[i % mdArray.length][i / mdArray.length];

        }
        System.out.println("The sum is " + sum2);

        // PATTERN 3
        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3");

        sum3 = 0;
        for (i = 0; i < mdArray[0].length; i++) {
            for (j = 0; j < mdArray[0].length; j++) {
                if (j == 0 || i == 0) {
                    sum3 = sum3 + mdArray[i][j];
                }
            }
        }
        System.out.println("The sum is " + sum3);

        // PATTERN 4
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4");

        sum4 = 0;
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length; j++) {
                if (i == 3 && j == 3) {
                    sum4 += mdArray[i][j];
                } else if (i == 0 && j == 3) {
                    sum4 += mdArray[i][j];
                } else if (i == 3 && j == 0) {
                    sum4 += mdArray[i][j];
                } else if (i == 0 && j == 0) {
                    sum4 += mdArray[i][j];
                }
            }
        }
        System.out.println("The sum is " + sum4);

        // PATTERN 5
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5");

        sum5 = 0;
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray.length; j++) {
                if (i == 2 && j == 2) {
                    sum5 += mdArray[i][j];
                } else if (i == 1 && j == 1) {
                    sum5 += mdArray[i][j];
                } else if (i == 1 && j == 2) {
                    sum5 += mdArray[i][j];
                } else if (i == 2 && j == 1) {
                    sum5 += mdArray[i][j];
                }
            }
        }
        System.out.println("The sum is " + sum5);

        // PATTERN 6
        System.out.println("");
        System.out.println("6. SUM OF PATTERN 6");

        sum6 = 0;
        for (i = 0; i < mdArray.length; i++) {
            for (j = 0; j < mdArray[0].length; j++) {
                if (i == 3 && j == 3) {
                    sum6 += mdArray[i][j];
                } else if (i == 0 && j == 3) {
                    sum6 += mdArray[i][j];
                } else if (i == 3 && j == 0) {
                    sum6 += mdArray[i][j];
                } else if (i == 0 && j == 0) {
                    sum6 += mdArray[i][j];
                } else if (i == 2 && j == 2) {
                    sum6 += mdArray[i][j];
                } else if (i == 1 && j == 1) {
                    sum6 += mdArray[i][j];
                } else if (i == 1 && j == 2) {
                    sum6 += mdArray[i][j];
                } else if (i == 2 && j == 1) {
                    sum6 += mdArray[i][j];
                }

            }
        }
        System.out.println("The sum is " + sum6);

    }
}
