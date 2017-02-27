public class proov{
	public static void main(String[] args){
		andmed andmed1=new andmed(11, 20, 13);
		andmed andmed2=new andmed(2, 4, 6);
		
		System.out.println(andmed1.toString()); 
		System.out.println(andmed1.vastus());
		
		System.out.println(andmed2.toString()); 
		System.out.println(andmed2.vastus());
	}
}