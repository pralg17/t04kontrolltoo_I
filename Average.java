import java.io.*;
public class Average{

	public static float[] test = {1,2,3,4,5,6,7,8,9,10};
	String path;
	public static float[] filest;

	public static float averageOfThree(float number1, float number2, float number3) {
		return (number1 + number2 + number3) / 3;
	}

	public static float[] slidingAverage(float[] input, int numbersForAverage) {
		float[] output = new float[input.length-(numbersForAverage-1)];
		for (int i=0; i<input.length-(numbersForAverage-1); i++) {
			output[i] = averageOfThree(input[i], input[i+1], input[i+2]);
			//System.out.println(output[i]);
		}
		return output;
	}

	static BufferedReader file(String filePath) {
		try {
			return new BufferedReader(new FileReader(filePath));
		} catch (Exception e) {
			return null;
		}
	}

	public static float[] arrayFromFile(String filePath/*, float[] outputArray*/) throws IOException {
		BufferedReader array = file(filePath);
		String line = array.readLine();
		String[] help = line.split(",");
		float[] outputArray = new float[help.length];
		for (int i=0; i<help.length; i++) {
			outputArray[i] = Float.parseFloat(help[i]);
		}
		return outputArray;
	}

	public static void saveToFile(String filepath, float[] answer) {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<answer.length; i++) {
			sb.append(answer[i]);
			sb.append(",");
		}
		try (PrintWriter pw = new PrintWriter(new FileWriter(filepath))) {
			pw.println(sb);
			pw.close();
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) throws IOException {
		//System.out.println(averageOfThree(3,4,5));
		//slidingAverage(test, 3);
		//slidingAverage(arrayFromFile("data.txt", filest), 3);
		saveToFile("vastus.txt", slidingAverage(arrayFromFile("data.txt"), 3));
	}
}

/*
*/
