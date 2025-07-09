/*
	Name: Aikaterinh Palaiologou
	
*/

class App2 { 

	public static void main (String args[]){	
	 	int pin [] [] = {{182,41,202},{145,85,325},{195,15,115},{110,24,407},{255,11,357}};// Fill your code here
	 	
   		// Fill your code here
		final int x=5;
		final int y=3;
		String s="--------------------------------------------------";
		System.out.println(s+"\n"+"| Eklogikh "+"|Ypopshfios A"+"|Ypopshfios B"+"|Ypopshfios G|");
		System.out.println("|Perifereia"+"|            "+"|            "+"|            |");
		System.out.println(s);
		System.out.println("|     1     "+"|   "+pin[0][0]+"     "+"|    "+pin[0][1]+"     "+"|    "+pin[0][2]+"     |");
		System.out.println("|     2     "+"|   "+pin[1][0]+"     "+"|    "+pin[1][1]+"     "+"|    "+pin[1][2]+"     |");
		System.out.println("|     3     "+"|   "+pin[2][0]+"     "+"|    "+pin[2][1]+"     "+"|    "+pin[2][2]+"     |");
		System.out.println("|     4     "+"|   "+pin[3][0]+"     "+"|    "+pin[3][1]+"     "+"|    "+pin[3][2]+"     |");
		System.out.println("|     5     "+"|   "+pin[4][0]+"     "+"|    "+pin[4][1]+"     "+"|    "+pin[4][2]+"     |");
		System.out.println(s);
		int sum1=0;
		int sum2=0;
		int sum3=0;
		for (int i=0;i<x;i++){
			sum1+=pin[i][0];
			sum2+=pin[i][1];
			sum3+=pin[i][2];
		}
		System.out.println("Pshfoi Ypopshfiou A :"+sum1);
		System.out.println("Pshfoi Ypopshfiou B :"+sum2);
		System.out.println("Pshfoi Ypopshfiou G :"+sum3);
		float sum=0;
		for (int i=0;i<x;i++){
			for(int j=0;j<3;j++){
				sum+=pin[i][j];
			}
		}
		float pos1=(sum1/sum)*100;
		float pos2=(sum2/sum)*100;
		float pos3=(sum3/sum)*100;
		System.out.printf("Pososto Ypopshfiou A :%.0f",pos1);
		System.out.print("%\n");
		System.out.printf("Pososto Ypopshfiou B :%.0f",pos2);
		System.out.print("%\n");
		System.out.printf("Pososto Ypopshfiou G :%.0f",pos3);
		System.out.print("%\n");
		float max=pos1;
		String onoma="Ypopshfios A";
		if (pos2>max){
			max=pos2;
			onoma="Ypopshfios B";
		}
		if (pos3>max){
			max=pos3;
			onoma="Ypopshfios G";
		}
		if (max>50){
			System.out.println("Nikhths eklogwn :"+onoma);
		}else{
			float max2;
			String onoma2;
			if(max==pos1){
				max2=pos2;
				onoma2="Ypopshfios B";
				if (pos3>max2){
					max2=pos3;
					onoma2="Ypopshfios G";
				}
			}else if(max==pos2){
				max2=pos1;
				onoma2="Ypopshfios A";
				if(pos3>max2){
					max2=pos3;
					onoma2="Ypopshfios G";
				}
			}else{
				max2=pos1;
				onoma2="Ypopshfios A";
				if(pos2>max2){
					max2=pos2;
					onoma2="Ypopshfios B";
				}
			}
			System.out.print("Tha diejaxuei epanalhptikos gyros metajy twn : "+onoma+" me pososto ");
			System.out.printf("%.0f",max);
			System.out.print("%\n");
			System.out.print("kai :"+onoma2+"me pososto ");
			System.out.printf("%.0f",max2);
			System.out.print("%\n");
		}
   	}	
}
