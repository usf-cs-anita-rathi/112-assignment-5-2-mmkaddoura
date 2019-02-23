// Define a class called Odometer that will be used to track fuel and mileage for an automobile. The class should have instance variables to track the miles driven and the fuel efficiency of the vehicle in miles per gallon. Include a mutator method to reset the odometer to zero miles, a mutator method to set the fuel efficiency, a mutator method that accepts miles driven for a trip and adds it to the odometer’s total, and an accessor method that returns the number of gallons of gasoline that the vehicle has consumed since the odometer was last reset.
//seters private, getters public
public class Odometer{

	private float miles;
	private float fuel;

	public Odometer(float startMiles, float startfuel){
		 miles= startMiles;
		 fuel= startfuel;
	}

	public float getMiles(){
		return miles;
		//System.out.println(miles);
	}

	public void setMilesZero(){
		miles=0;
	}

	public void setFuel(float newValue){
		fuel=newValue;
	}

	public void addMiles(float newValue){
		miles+=newValue;
	}

	public float getGallons(){
		return(miles/fuel);
	}

}