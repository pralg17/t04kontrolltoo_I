public class ProovMassiiv {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        double[] numbers2 = new double[numbers.length - 2];

        for (int j = 0; j < numbers2.length; j++)
        {
            numbers2[j] = (numbers[j] + (numbers[j] + 1) + (numbers[j] + 2))/3.0;
        }
        System.out.println("Siin on kaks massiivi:");
        System.out.println("See on esimene massiiv");
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
        System.out.println("See on teine massiiv");
        for (int j = 0; j < numbers2.length; j++)
            System.out.println(numbers2[j]);
    }
}
