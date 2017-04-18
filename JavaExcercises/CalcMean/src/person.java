/**
 * Created by piush on 25/02/2017.
 */
public class person implements objectInterface{
    double[] height;

    public person(double[] height) {
        this.height = height;
    }

    public void setHeight(double[] height) {
        this.height = height;
    }

    public double[] getHeight() {
        return height;
    }

    public double getSize(){
        return getHeight().length;
    }

    @Override
    public double calcMean() {
        double sum = 0;
        for (int i = 0; i < getSize(); i++){
            sum = sum + height[i];
        }
        double average = sum/getSize();
        return average;
    }
}
