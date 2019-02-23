import java.util.Scanner;


public class Temperature{

	private float temp;
	private String scale;
	private float ftemp;
	private float ctemp;

	public void Temperature(){
		temp=0;
		scale="C";

	}

		/*public double f_temp(){
		ftemp=ctemp * 5/9-32;
		return ftemp;
	}

		public double c_temp(){
		ctemp=ftemp * 9/5+32;
		return ctemp;
	}*/

	public float setTemp(){
		Scanner input = new Scanner(System.in);
 		System.out.println("What scale would you like to use?");
 		scale=input.next();
 		System.out.println("What is the temperature in said scale?");
 		temp=input.nextFloat();
 		if (scale.equals("C"))
 			{ctemp=temp;
 			ftemp=(temp * 9/5) + 32;//5/9-32
 			
 			
			return ftemp;}

 		else //if (scale.equals("F"))
 			{ftemp=temp;
 			ctemp=(temp - 32) * 5/9;;//9/5+32
 			
 			
			return ctemp;}

	}

	public void setDegrees(float deg){
  		temp = deg;
	}

	public void setScale(){
		scale="F";
		scale="C";
  		//"F" = ftemp;
  		//"C" = ctemp;
  	}

	public String toString(){
		return("In celcius the temp is "+ctemp+". And in farenheit the temp is "+ftemp);
	}




} 
