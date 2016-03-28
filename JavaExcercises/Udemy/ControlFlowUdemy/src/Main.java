public class Main {

    public static void main(String[] args) {
        /*char charValue = 'k';
        switch (charValue){
            case 'A':case 'B':case'C':case'D':case'E':
            {
                System.out.println(charValue + " was found");
                break;
            }
            default:
                System.out.println(charValue + " was not found");
                break;
        }*/
        //calculateInterest(10000.0);

        /*int counter = 0;
        for (int i = 0; i < 100; i++) {


            if (isPrime(i)) {
                System.out.println(i);
                counter++;
            }
            if (counter == 3) {
                System.out.println("Existing..");
                break;
            }


        }*/

        /*int count = 1;
        while(true){
            if(count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }*/

        int number = 5;
        int finishNumber = 20;
        int foundEvenNumber = 0;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            foundEvenNumber++;
            System.out.println("Even number " + number);
            number++;

            if (foundEvenNumber >= 5) {
                break;
            }
            }
        System.out.println(foundEvenNumber);
    }

    public static boolean isEvenNumber(int number){
        if(number% 2 == 0){
            return true;
        }
        return false;
    }

    public static  boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2 ; i <= n/2;i++){
            if( n% i == 0){
                return  false;
            }

        }
        return true;
    }

    public static void calculateInterest(double principal){
        for(double i = 2;i < 9;i++) {
            System.out.println(" the interest rate is: " + (principal * i / 100.0));
        }

    }
}
