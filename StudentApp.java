/*
	Name: Aikaterinh Palaiologou
	
*/

import java.util.Scanner;

class StudentApp {

	public static void main (String args[]) {
		
		StudentList Lesson = new StudentList(); /* Fill your code here */
		
		// Fill your code here
		Scanner obj= new Scanner(System.in);
		for (;;) {
			System.out.println ("1. Insert Student");
			System.out.println ("2. Lookup Student");
			System.out.println ("3. Display List");
			System.out.println ("0. Exit");
			
			// Fill your code here
			System.out.print("Give your answer :");
			int chose=obj.nextInt();
			if(chose==0){
				break;
			}else{
				switch(chose){
					case 1:
					  System.out.print("Give a name :");
					  String name=obj.next();
					  System.out.print("Give RN :");
				      String rn=obj.next();
					  System.out.print("Give grade :");
				      int grade=obj.nextInt();
				      Student st=new Student(name,rn,grade);
				      Lesson.InsertStudent(st);
				      break;
				    case 2:
				      System.out.print("Give RN :");
					  String ok=obj.next();
				      Lesson.LookupStudent(ok);
				      break;
				    case 3:
				      Lesson.DisplayList();
				      break;
				}
			}
			
		}// for
		
	} //main
	
}//StudentApp
