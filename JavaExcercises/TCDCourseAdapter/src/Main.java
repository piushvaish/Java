public class Main {

    public static void main(String[] args) {
        int[][] myNumbers = {
                {2, 4, 6, 8, 10},
                {1, 3, 5, 7, 9}
        };
        int i, j;
        int sum = 0;
        for (i = 0; i < myNumbers.length; i++) {
            for (j = 0; j < myNumbers[i].length; j++) {
                sum += myNumbers[i][j];
            }
        }
        System.out.println("The sum is " + sum);
    }
}
