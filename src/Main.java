import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] numbers = {4, 7, 2};
        String firstYearSalaryString = readFile("palgad.txt").get(0);
        Double firsYearSalary = Double.parseDouble(firstYearSalaryString);


        System.out.println(multiplySqrt(10, 20));
        System.out.println(multiplyPowArray(numbers));

        System.out.println(readFile("palgad.txt"));
        System.out.println();

        double[] newSalarys = new double[10];
        for (String i : readFile("palgad.txt")) {

            double n = Double.parseDouble(i);
            double s = firsYearSalary * n;
            System.out.println(s);

        }
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

    private static List<String> readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        List<String> salary = new ArrayList<>();
        String s;
        while ((s = reader.readLine()) != null) {
            salary.add(s);
        }
        return salary;
    }

    private static void createFile(String filename, String content) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(filename), "utf-8"
        ))) {
            writer.write(content);
            writer.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }
}
