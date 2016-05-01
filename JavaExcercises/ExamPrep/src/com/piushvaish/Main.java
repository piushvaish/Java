package com.piushvaish;

public class Main {

    public static void main(String[] args) {

        Course course = new Course("12","IS development");
        course.setHourlyFees(6.0);
        course.setNumOfHours(1.0);
        System.out.println(course.totalWeeklyCost());

//        int x = 0;
//        giveMeAString(x);
//        System.out.println(x);


//        Scanner in = new Scanner(System.in);
//        int side = 0;
//        System.out.printf("This program will display a full and an empty square given the side length.\n");
//        System.out.print("Enter a side length: ");
//        side = in.nextInt();
//        System.out.println();
//        //Filled square
//        int row = (side * 2) + 1;
//        for (int i = 1; i <= side; i++) {
//            for (int j = 1; j <= row; j++) {
//                if (j == side + 1) {
//                    System.out.print(" ");
//                    continue;
//                }
//                if (((j > side + 2) && (i > 1 && i < side) && (j < row))) {
//                    System.out.print(" ");
//                    continue;
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//
//        System.out.println();
    }

//        Scanner in = new Scanner(System.in);
//
//        Question q = new Question();
//        q.setText("Who is the inventor of Java");
//        q.setAnswer("James");
//
//        q.display();
//        System.out.println("Your answer: ");
//        String response = in.nextLine();
//        System.out.println(q.checkAnswer(response));
//          ChoiceQuestion first = new ChoiceQuestion();
//
//        first.setText("what the original name of Java Language");
//        first.addChoice("7",false);
//        first.addChoice("Duke",false);
//        first.addChoice("Oak",true);
//        first.addChoice("Gosling",false);
//        first.display();
//        System.out.println("your answer :");
//        Scanner in = new Scanner(System.in);
//        String response = in.nextLine();
//        System.out.println(first.checkAnswer(response));

        // write your code here
//        int i = 10;
//        int b = g(i);
//        System.out.println(b + i);
//    }
//
//    public static int f(int i){
//        int n = 0;
//        while (n* n <= 1){
//            n++;
//        }
//        return n -1;
//    }
//    public static int g(int a){
//        int b = 0;
//        for (int n = 0; n < a;n++){
//            int i = f(n);
//            b = b + i;
//        }
//        return b;
//    }
    public static void giveMeAString(int y){
        y = 10;
    }

    public static void filledBox(int n){
        String string ="*";
        for(int row = 0;row < n; row++){
            for(int col = 0;col < n; col++){
                System.out.print(string);
            }
            System.out.println();

        }
    }
    public static void infilledBox(int n) {
        String string = "*";
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n) {
                    System.out.print(string);
                } else if (col == 1 || col == n) {
                    System.out.print(string);
                } else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }

}
