public class GradingDemo{
	public static void main(String[]args){

		Grading_522 student1 = new Grading_522();
		student1.compute_numeric();
		student1.compute_letter();
		System.out.println(student1.toString());

	}
}