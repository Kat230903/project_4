/*
	Name: Aikaterinh Palaiologou
	
*/


class Clock {
	
	//Data
	
	protected int h;
	protected int m;
	protected int s;
	
	
	// Methods
	
	void setHour(int h) {
		
		// Fill your code here
		this.h=h;
	}

	void setMin(int m) {
		
		// Fill your code here
		this.m=m;
	}
	
	void setSec(int s) {
		
		// Fill your code here
		this.s=s;
	}

	void tick() {
		
		// Fill your code here
		(this.s)++;
		if(this.s==60){
			(this.m)++;
			this.s=0;
			if(this.m==60){
				(this.h)++;
				this.m=0;
				if(this.h==24){
					this.h=0;
				}
			}
		}
	}

	public String toString() {
		
		// Fill your code here
		if(h>=10&m>=10&s>=10){
			return h+":"+m+":"+s;
		}else if(h<10&m<10&s<10){
			return "0"+h+":0"+m+":0"+s;
		}else if(h<10&m<10&s>=10){
			return "0"+h+":0"+m+":"+s;
		}else if(h<10&m>=10&s<10){
			return "0"+h+":"+m+":0"+s;
		}else if(h>=10&m<10&s<10){
			return h+":0"+m+":0"+s;
		}else if (h<10&m>=10&s>=10){
			return "0"+h+":"+m+":"+s;
		}else if(h>=10&m<10&s>=10){
			return h+":0"+m+":"+s;
		}else if(h>=10&m>=10&s<10){
			return h+":"+m+":0"+s;
		}
        return null;		
	}
}
