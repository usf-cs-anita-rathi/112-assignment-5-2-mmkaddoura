import java.util.Scanner;

public class Grading_522{

	private double quiz1, quiz2, quiz3, midterm, exam, overall, numeric_total;
	private String letter_grade;
	 

	public void studentRecord(){
		quiz1=0;
		quiz2=0;
		quiz3=0;
		midterm=0;
		exam=0;
		overall=0;
		numeric_total=0;

	}

	public double compute_numeric(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score for Quiz1:");
		quiz1=input.nextDouble();
		System.out.println("Enter the score for Quiz2:");
		quiz2=input.nextDouble();
		System.out.println("Enter the score for Quiz3:");
		quiz3=input.nextDouble();
		System.out.println("Enter the score for the midterm:");
		midterm=input.nextDouble();
		System.out.println("Enter the score for final exam:");
		exam=input.nextDouble();

		double quiz_total=(quiz1+quiz2+quiz3)*10/12;
		double midterm_total=midterm*.35;
		double exam_total=exam*.4;
		numeric_total=quiz_total+midterm_total+exam_total;
		return (numeric_total);
	}

	public String compute_letter(){
		//grade=(m*.35)+(e*.4)+(q1+q2+q3)*(4/30)
		if (numeric_total>=90)
			{letter_grade="A";
			return "A";}
		else if (numeric_total>=80)
			{letter_grade="B";
			return "B";}
		else if (numeric_total>=70)
			{letter_grade="C";
			return "C";}
		else if (numeric_total>=60)
			{letter_grade="D";
			return "D";}
		else
			{letter_grade="F";
			return "F";}

	}

	public String toString(){
		return ("Quiz1:"+quiz1+" Quiz2:"+quiz3+" Quiz3:"+quiz3+" Midterm: "+midterm+"Final exam:"+exam+" Overall:"+numeric_total+"Letter grade: "+letter_grade);
	}

	

}