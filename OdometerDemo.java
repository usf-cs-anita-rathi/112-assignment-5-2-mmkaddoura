public class OdometerDemo{
	public static void main (String[]args){


		Odometer A=new Odometer(20,10);
		System.out.println("Miles: "+A.getMiles());
		A.setFuel(15);
		System.out.println("Gallons:"+A.getGallons());
		A.setMilesZero();
		System.out.println("Miles: "+A.getMiles());
		A.addMiles(5);
		System.out.println("Miles: "+A.getMiles());
		System.out.println("Gallons:"+A.getGallons());



	}
}