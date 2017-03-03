public class Auto2k{
	double _kaugus;
	double _kiirus; 
	public Auto2k(double kaugus, double kiirus){
	_kaugus=kaugus; _kiirus=kiirus;
	}
	public double distanceFromStart(){
		return (0+_kaugus);
	}
	public double Asukoht3s(){
		return (_kaugus+0.0008333*_kiirus);
	}	
	public double Asukoht5m(){
		return (_kaugus+0.08333*_kiirus);
	}	
	public double Asukoht2h(){
		return (_kaugus+2*_kiirus);
	}
	public String toString(){
		return "("+_kaugus+", "+_kiirus+")";
	}
}
