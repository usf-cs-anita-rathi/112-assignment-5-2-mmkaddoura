public class TemperatureDemo{
	public static void main(String[]args){

		Temperature t1 = new Temperature();
		t1.setTemp();
		System.out.println(t1.toString());
		Temperature t2 = new Temperature();
		t2.setScale();
		t2.setDegrees(5);

	}
}