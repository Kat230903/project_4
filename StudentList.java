/*
	Name: Aikaterinh Palaiologou
	Student Number:p3210149
*/

class StudentList {
	
	private Student [] myList = new Student[50];// Fill your code here
	
	private int length = 0;
	
		
	void InsertStudent(Student newStudent){
		
		// Fill your code here
		myList[length]=newStudent;
		this.length++;
		
	}//InsertStudent
	
	
	void LookupStudent(String RN) {
		
		// Fill your code here
		boolean flag=false;
		//int i=0;
		Student el= new Student(" "," ",0);
		int j=0;
		for(int k=0;k<myList.length;k++){
			if(myList[k]!=null){
				j++;
			}
		}
		for(int i=0;i<j;i++){
			if(RN.equals(myList[i].getRN())){
				flag=true;
				el=myList[i];
			}
		}
		if(flag==false){
			System.out.println("There is no student with this RN");
		}else{
			System.out.println("The grade of this student is : "+el.getGrade());
		}
		
	}//LookupStudent
	
	
	void DisplayList() {
		
		// Fill your code here
		int j=0;
		for(int i=0;i<myList.length;i++){
			if(myList[i]!=null){
				j++;
			}
		}
		for(int i=0;i<j;i++){
			System.out.println(myList[i]);
		}
			
	}//DisplayList
	
}//StudentList	