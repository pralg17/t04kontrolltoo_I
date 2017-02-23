import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static ArrayList<Double> newSalarys = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int[] numbers = {4, 7, 2};
        String inputFilename = "palgad.txt";
        double firstMonthSalary = readFile(inputFilename).get(0);
        Double salarySum = 0.0;

        List<Double> salaryChange = readFile(inputFilename).subList(1, (readFile(inputFilename).size()));

        System.out.println(multiplySqrt(10, 20));
        System.out.println(multiplyPowArray(numbers));
        
        newSalarys.add(firstMonthSalary);
        for (Double i : salaryChange) {
            newSalarys.add(calculateNewSalary(firstMonthSalary, i));
        }

        String outputFilename = "uuedpalgad.txt";
        createFile(outputFilename, newSalarys);

        for (Double i : newSalarys) {
            salarySum = salarySum + i;
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

    private static ArrayList<Double> readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        ArrayList<Double> salary = new ArrayList<>();
        String s;
        while ((s = reader.readLine()) != null) {
            salary.add(Double.parseDouble(s));
        }
        return salary;
    }

    private static Double calculateNewSalary(Double salary, Double salaryChange) {
        return salaryChange * salary;
    }

    private static void createFile(String file, ArrayList<Double> arrData)
            throws IOException {
        try (FileWriter writer = new FileWriter(file + ".txt")) {
            for (Double anArrData : arrData) writer.write(anArrData.toString() + "\n");
            writer.close();
        }
    }
}
