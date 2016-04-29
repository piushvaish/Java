public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        displayHighScorePosition("manoo",50);
        System.out.println(calcFeetAndInchesToCentimetres(5,5));
    }

    /*public static int calculateHighScorePosition(int score){
        int position = 0;
        if (score >= 1000){
            position = 1;
        }else if (score >= 500 && score < 1000){
            position = 2;
        } else if(score >= 100 && score < 500){
            position = 3;
        }else {
            position = 4;

        }
        return position;

    }*/

    /*public static void displayHighScorePosition(String name, int position){
        int displayPosition = calculateHighScorePosition(position);
        System.out.print(name + " managed to get into position " + displayPosition + " on the high score table" );
    }*/

    public static double calcFeetAndInchesToCentimetres(double feet,double inches){

        double centimetres = 0;

        if(feet >= 0){
            centimetres = feet * 12 * 2.54;
        } else {
            return -1;
        }
        if (inches >=0 && inches <= 12){
            centimetres += inches * 2.54;
        }else {
            return -1;
        }

        return centimetres;
    }

    public static double calcFeetAndInchesToCentimetres(double inches){
        if(inches >=0){
            double feet = (int)(inches/12.0);
            double remainingInches = inches - (feet*12);
            return calcFeetAndInchesToCentimetres(feet,inches);

        } else {
            return -1;
        }

    }



    }
