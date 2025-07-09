/*
	Name: Aikaterinh Palaiologou
*/

class AMPMClock extends Clock {
	
	// Fill your code here
	private  String yo="";
	public void setAMPM(boolean yes){
		if(yes==true){
			if (super.h>=0 && super.h<12){
				yo="am";
			}else if(super.h>=12&& super.h<=23){
				yo="pm";
			}
		}else{
			yo="";
		}
		//return yo;
	}
	public String toString(){
		return super.toString()+yo;
	}
}
