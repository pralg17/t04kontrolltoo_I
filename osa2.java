public class osa2{
	public static void main(String[] args){
		String andmerida="4,4,5,5;1;3;6;2";
		String[] m=andmerida.split(",");
		String[] n=m[3].split(";");
		System.out.println(m[0]+" on hinne mis saadi "+n[0]+" ainepunkti mahulises aines");		
		System.out.println(m[1]);
		System.out.println(m[2]);
		System.out.println(m[3]);
		System.out.println(n[0]);
		
		int a1=Integer.parseInt(m[0]);
		int a2=Integer.parseInt(m[1]);
		int a3=Integer.parseInt(m[2]);
		int a4=Integer.parseInt(m[3]);
		int a5=Integer.parseInt(n[0]);
		double keskminekaal=(a2+a2+a3)/a1;
		System.out.println(keskminekaal);
	}
}