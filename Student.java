/*
	Name: Aikaterinh Palaiologou
	
*/

class Student {
	
	private String Name;
	private String RN;
	private int Grade;
	
	Student(String Name, String RN, int Grade){
		// Fill your code here
		this.Name=Name;
		this.RN=RN;
		this.Grade=Grade;
	}
	
	// Fill your code here
	String getRN(){
		return RN;
	}
	int getGrade(){
		return Grade;
	}
	public String toString(){
		return "Name :"+this.Name+"\nRn :"+this.RN+"\nGrade :"+this.Grade;
	}
	
}// Student
