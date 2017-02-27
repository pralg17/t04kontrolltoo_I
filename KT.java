import java.io.*;
import java.util.Random;

public class KT {
	public static void main(String[] args) throws IOException {
		
		double numbers1 = average(3, 4, 5);
		double[] numbers2 = new double[] {23,5,67,43,201,22,9,70,78,100};
		System.out.println("Arvude kronoloogiline keskmine on " + numbers1);
		System.out.println("Massiivist voetud arvude kronoloogiline keskmine on " + averageArray(numbers2));
		createFile();
		fileRW();
		
	}
	
	public static double average(double num1, double num2, double num3) {
		
		double average = (num1 / 2 + num2 + num3 / 2) / 2;
		return average;
		
	}
	
	public static double averageArray(double[] numbers2) {
		
		double averageFirstNum = numbers2[0] / 2;
		double averageLastNum = numbers2[numbers2.length-1] / 2;
		double averageMiddleNums = 0;
		
		
		for(int i = 1; i < numbers2.length-1; i++) {
			averageMiddleNums = averageMiddleNums + numbers2[i];
		}
		
		double average = (averageFirstNum + averageMiddleNums + averageLastNum) / (numbers2.length-1);
		
		return average;
		// 11.5 + 495 + 50 = 556.5
		//556.5 / 9.0
	}
	
	public static void createFile() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
		Random rand = new Random();
		bw.write("kuupaev,kell00,kell06,kell12,kell18,kell24");
		bw.newLine();
		String date;
		
		for(int i = 1; i < 29; i++) {
			if(i < 10) {
				date = "0" + i + ".02.17";
			} else {
				date = i + ".02.17";
			}
			
			int time00 = rand.nextInt(21)-10;
			int time06 = rand.nextInt(21)-10;
			int time12 = rand.nextInt(21)-10;
			int time18 = rand.nextInt(21)-10;
			int time24 = rand.nextInt(21)-10;
			String newData = date + "," + String.valueOf(time00) + "," + String.valueOf(time06)
			+ "," + String.valueOf(time12) + "," + String.valueOf(time18) + "," + String.valueOf(time24);
			bw.write(newData);
			bw.newLine();
		}
		bw.close();
	}
	
	public static void fileRW() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
		
		String fileRow = br.readLine();
		fileRow = br.readLine();
		
		bw.write("kuupaev\tkeskminetemp");
		bw.newLine();
		
		while(fileRow != null) {
			String[] dataFromFile = fileRow.split(",");
			
			try {
				String date = dataFromFile[0];
				double time00 = Double.parseDouble(dataFromFile[1]);
				double time06 = Double.parseDouble(dataFromFile[2]);
				double time12 = Double.parseDouble(dataFromFile[3]);
				double time18 = Double.parseDouble(dataFromFile[4]);
				double time24 = Double.parseDouble(dataFromFile[5]);
				
				double middleTemps = time06 + time12 + time18;
				double average = (time00 / 2 + middleTemps + time24 / 2) / 4;
				
				String newData = date + "\t" + String.valueOf(average);
				bw.write(newData);
				bw.newLine();
			} catch(IOException e) {
				System.out.println("Error");
			}
			fileRow = br.readLine();
		}
		br.close();
		bw.close();
	}
	
	
	
}