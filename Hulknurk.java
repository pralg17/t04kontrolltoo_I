import java.util.*;
import java.io.*;
import java.net.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class Hulknurk{
		
		List<Integer> x_koord = new ArrayList<Integer>();
		List<Integer> y_koord = new ArrayList<Integer>();
		public Hulknurk(List<Integer> x, List<Integer> y){
			x_koord = x;
			y_koord = y;
		}
		
		public String Vordkylgne(int veaprotsent){
			
			List<Double> kyljed = new ArrayList<Double>();
			List<Double> rounded = new ArrayList<Double>();
			double vp = (double)veaprotsent/100;
			double kylg = 0;
			for(int i=1; i<=(x_koord.size()); i++){
				if (i == x_koord.size()) {
					kylg = Math.sqrt(Math.pow((x_koord.get(i-1)-x_koord.get(0)), 2)+
									Math.pow((y_koord.get(i-1)-y_koord.get(0)), 2));
				} else {
					kylg = Math.sqrt(Math.pow((x_koord.get(i)-x_koord.get(i-1)), 2)+
									Math.pow((y_koord.get(i)-y_koord.get(i-1)), 2));
				}
				kyljed.add(kylg);
			}
			System.out.println("Kyljed:");
			for(Iterator<Double> i = kyljed.iterator(); i.hasNext(); ) {
				double item = i.next();
				item = round(item);
				rounded.add(item);
				System.out.println(item);
			}
			System.out.println("");
			System.out.println(kaugusK(vp));
			System.out.println("");
			System.out.println("Vahemik: ");
			for(int i=1; i<rounded.size();i++){
			
				if(!veaArvutus(rounded.get(0), rounded.get(i), vp)){
					
					return "Pole vordkylgne!";
					
				}
			}
			
			return "On vordkylgne!";
			
		}
		public String kaugusK(double vp){
			
			List<Double> kaugused = new ArrayList<Double>();
			List<Double> rounded = new ArrayList<Double>();
			double kaugus = 0;
			for(int i=0; i<x_koord.size(); i++){
			
				kaugus = Math.sqrt(Math.pow((x_koord.get(i)-0), 2)+
									Math.pow((y_koord.get(i)-0), 2));
				kaugused.add(kaugus);
			}
			System.out.println("Kaugused:");
			for(Iterator<Double> i = kaugused.iterator(); i.hasNext(); ) {
				double item = i.next();
				item = round(item);
				rounded.add(item);
				System.out.println(item);
			}
			System.out.println("");
			System.out.println("Veaprotsent "+vp*100+"%");
			System.out.println("");
			System.out.println("Vahemik: ");
			for(int i=1; i<rounded.size();i++){
			
				if(!veaArvutus(rounded.get(0), rounded.get(i), vp)){
					
					return "Ei asu samal kaugusel!";
					
				}
			}
			
			return "Samal kaugusel!";
		}
		
		public double round(double d) {
			DecimalFormat oneDForm = new DecimalFormat("#.#");
			return Double.valueOf(oneDForm.format(d));
		}
		
		public boolean veaArvutus(double arv1, double arv2, double vp){
			
			System.out.println(arv1*(1-vp)+"  "+arv1*(1+vp));
			
			if(arv1*(1-vp) <= arv2 && arv2 <= arv1*(1+vp)){
				return true;
			} else {
				return false;
			}
			
		}
			
		
		@Override
		public String toString(){
			for(int i=0; i<x_koord.size(); i++){
				
				System.out.println("x"+(int)(i+1)+": "+x_koord.get(i)+", y"+(int)(i+1)+
									": "+y_koord.get(i));
				
			}
			return "";
		}
		
}