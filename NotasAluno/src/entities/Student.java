package entities;

public class Student {
	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	
	public double finalGrade() {
		return this.firstGrade + this.secondGrade + this.thirdGrade;
	}
	
	public String status() {
		double finalGrade = this.finalGrade();
		
		if(finalGrade >= 60) {
			return "PASS";
		}
		
		double missingPoints = finalGrade - 60;
		return ("FAILED \n" + "MISSING " + String.format("%.2f", missingPoints) +  "POINTS");
	}
	
	public String toString() {
		return "FINAL GRADE = "
				+ this.finalGrade()
				+ "\n"
				+ this.status();
	}
	
	
}
