package Task_2;

public class Array_2 {
    public static void main(String[] args) {
        float weightOne = 1.57f, weightTwo = 7.654f, weightThree = 9.986f;
        float[] weights = {weightOne, weightTwo, weightThree};
        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.print(weights[i]);
            } else {
                System.out.print(weights[i] + ", ");
            }
        }
        System.out.println();
    }
}
