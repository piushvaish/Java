public class Main
{

    public static void main(String[] args)
    {
        double result1 = cubeVolume(2);
        double result2 = cubeVolume(10);
        System.out.println("The cude with side length of 2 is: " + result1);
        System.out.println("The cude with side length of 10 is: " + result2);
    boxString("Piush");
        printTriangle(5);
        System.out.println(digitSum(10));
    }

    /**
    * Computes the volume of the cube
    * @param sidelength the side length of the cube
    * @return the volume
    */
    public static  double cubeVolume(double sidelength) {


        /*
        double volume;
        if(sidelength <=0){return 0;}
        return sidelength * sidelength * sidelength;

        */
        if (sidelength < 0) {
            return -1;
        }
        if (sidelength > 0) {
            return 1;
        }
        return 0;
    }
    /**
     * Prints a string in a box
     * @param contents the string to enclose in a box
     */
public static void boxString(String contents){
    int n = contents.length();
    if(n == 0){
        return;
    }else {
        for (int i = 0; i < n + 2; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.println("!" + contents + "!");
        for (int i = 0; i < n + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
    /**
     * Uses recursion
     */
    public static void printTriangle(int sideLength){
        if(sideLength< 1){
            return;
        }
        printTriangle(sideLength-1);
        for(int i = 0; i < sideLength; i++){
            System.out.print("[]");
        }
        System.out.println();
    }

    public static int digitSum(int n){
        if(n == 0){
            return 0; // special case
        }
        return digitSum(n/10) + n%10; // general case
    }
    //array example

    public static double sum(double[] values){
        double total = 0;
        for(double element : values){
            total = total + element;
        }
        return total;
    }




}

