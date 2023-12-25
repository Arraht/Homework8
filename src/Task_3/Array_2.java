package Task_3;

public class Array_2 {
    public static void main(String[] args) {
        float weightOne = 1.57f, weightTwo = 7.654f, weightThree = 9.986f;
        float[] weights = {weightOne, weightTwo, weightThree};
        for (int i = weights.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weights[i]);
            } else {
                System.out.print(weights[i] + ", ");
            }
        }
    }
}