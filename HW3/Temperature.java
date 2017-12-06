
public class Temperature {
	
	double temp;
	char scale;
	
	//Constructors*******************************
	public Temperature() {
		temp = 0;
		scale = 'C';
	}
	
	public Temperature(double t) {
		this.temp = t;
	}
	
	public Temperature(char s) {
		this.scale = s;
	}
	
	public Temperature(double t, char s) {
		this.temp = t;
		this.scale = s;
	}
	
	//Accessor*************************************
	public double getDegreeC(double tempF, char s) {
		if(s == 'F') {
			double tempC = 5 * (tempF - 32) / 9;
			return tempC;
		}
		else return 0;
	}
	public double getDegreeF(double tempC, char s) {
		if(s == 'C') {
			double tempF = (9 * (tempC) / 5) + 32;
			return tempF;
		}
		else return 0;
	}
	
	//Mutators*************************************
	public void setBoth(double t, char s) {
		this.temp = t;
		this.scale = s;
	}
	
	public void setTemp(double t) {
		this.temp = t;
	}
	
	public void setScale(char s) {
		this.scale = s;
	}
	
	//Comparison Method*****************************
	public boolean equals(double temp1, double temp2) {
		return (temp1 == temp2);
	}
	
	public boolean isbigger(double temp1, double temp2) {
		return (temp1 > temp2);
	}
	
	public boolean issmaller(double temp1, double temp2) {
		return (temp1 < temp2);
	}
}
