public class Ul1{
	public static void main(String[] args){
		Auto2k a1=new Auto2k(50,100);
		Auto2k a2=new Auto2k(100,90);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.distanceFromStart());
		System.out.println(a2.distanceFromStart());
		System.out.println(a1.Asukoht3s());
		System.out.println(a2.Asukoht3s());
		System.out.println(a1.Asukoht5m());
		System.out.println(a2.Asukoht5m());
		System.out.println(a1.Asukoht2h());
		System.out.println(a2.Asukoht2h());
	}
}