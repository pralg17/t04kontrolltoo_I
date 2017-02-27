import java.io.*;

/* VLADISLAV SUTOV
	 JAVA ESIMENE
	 KONTROLLTOO */

public class Keskmine{

	public static float[] testandmed = {88,712,1024,1280,9999,21000,54222,99818,102722,222222};


  // Arütmeetiline keskmine
	public static float kolmeArvuKeskmine(float num1, float num2, float num3) {
		return (num1 + num2 + num3) / 3;
	}


	// Libisev keskmine
	public static float[] libisevKeskmine(float[] input, int numbridKeskmiseLeidmiseks) {
		float[] output = new float[input.length-(numbridKeskmiseLeidmiseks-1)];
		for (int i=0; i<input.length-(numbridKeskmiseLeidmiseks-1); i++) {
			output[i] = kolmeArvuKeskmine(input[i], input[i+1], input[i+2]);
			System.out.print(output[i]+" ");
		}
		return output;
	}


	// Failist lugemine
	static BufferedReader file(String filePath) {
		try {
			return new BufferedReader(new FileReader(filePath));
		} catch (Exception e) {
			return null;
		}
	}


	// for tsükkel
	public static float[] massivFailist(String filePath) throws IOException {
		BufferedReader array = file(filePath);
		String line = array.readLine();
		String[] help = line.split(",");
		float[] outputArray = new float[help.length];
		for (int i=0; i<help.length; i++) {
			outputArray[i] = Float.parseFloat(help[i]);
		}
		return outputArray;
	}

	// faili salvestamine
	public static void salvestaFaili(String filepath, float[] answer) {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<answer.length; i++) {
			sb.append(answer[i]);
			sb.append(",");
		}
		try {PrintWriter pw = new PrintWriter(new FileWriter(filepath));
			pw.println(sb);
			pw.close();
		} catch (Exception e) {

		}
	}



	// Vastused

	public static void main(String[] args) throws IOException {
		//ESIMENE ÜLESANNE
    System.out.println("\nEsimene ülesanne:\nArvude 3,4,5 aritmeetiline keskmine on: "+ kolmeArvuKeskmine(3,4,5)+".\n");

    //TEINE ÜLESANNE
    System.out.println("Teine ülesanne(massiiv arvudest):");
		libisevKeskmine(testandmed, 3);
    System.out.println("\n");

    //KOLMAS ÜLESANNE
    System.out.println("Kolmas ülesanne (lisaks ka failis vastus.txt):");
		salvestaFaili("vastus.txt", libisevKeskmine(massivFailist("data.txt"), 3));
		System.out.println("\n");

	}
}
