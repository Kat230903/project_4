/*
	Name: Aikaterinh Palaiologou
	
*/

import java.util.concurrent.TimeUnit;

class AMPMClockApp {
	
	public static void main (String args[]) throws Exception{
		
		// Fill your code here
		AMPMClock clock = new AMPMClock();
		clock.setHour(16); 
		clock.setMin(28); 
		clock.setSec(58); 
		int count=1;
		clock.setAMPM(true);
		while(count<=181){
			System.out.println(clock.toString());
			TimeUnit.SECONDS.sleep(1);
			clock.tick();
			count++;
		}

	}
}



