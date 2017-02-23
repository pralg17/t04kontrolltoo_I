
public class Main {

    public static void main(String[] args) {
        int[] numbers = {4, 7, 2};

        System.out.println(multiplySqrt(10, 20));
        System.out.println(multiplyPowArray(numbers));
    }

    private static double multiplySqrt(double x, double y) {
        double i;
        i = (x * y);
        i = Math.sqrt(i);
        return i;
    }

    private static double multiplyPowArray(int[] array) {
        int counter = 0;
        double multiplyPow = 1;
        for (int i : array) {
            counter++;
            multiplyPow = i * multiplyPow;
        }
        return Math.pow(multiplyPow, counter);
    }


}
