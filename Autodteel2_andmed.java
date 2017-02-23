//Autod teel ulesanne 2 andmed

/*

3 sekundit -> 3 sekundit
5 minutit -> 300 sekundit
2 tundi -> 7200 sekundit

2 tundi -> 2 tundi
3 sekundit -> 0.00833333
5 minutit -> 0.0833333 tundi
*/

public class Autodteel2_andmed{
	public static void main(String[] args){
		Autodteel2 nr1 = new Autodteel2(20,50,0.00833333,0.0833333,2);
		Autodteel2 nr2 = new Autodteel2(50,70,0.00833333,0.0833333,2);
		
		System.out.println(nr1.toString());
		System.out.println(nr2.toString());
	}
}