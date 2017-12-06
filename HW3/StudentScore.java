public class StudentScore {
	public int quiz1, quiz2, quiz3, mid, fin;
	double overall, quizavg;
	char grade;
	
	public StudentScore() {
		this.quiz1 = 0;
		this.quiz2 = 0;
		this.quiz3 = 0;
		this.mid = 0;
		this.fin = 0;
	}
	
	// Mutators for scores
	public void setquiz1(int quiz1) {
		this.quiz1 = quiz1;
	}
	
    public void setquiz2(int quiz2) {
    	this.quiz2 = quiz2;
	}

    public void setquiz3(int quiz3) {
    	this.quiz3 = quiz3;
    }
    
    public void setmid(int mid) {
    	this.mid = mid;
    }
    
    public void setfin(int fin) {
    	this.fin = fin;
    }
	
    // Accessors for scores
	public int getquiz1() {
		return quiz1 * 10;
	}
	
	public int getquiz2() {
		return quiz2 * 10;
	}
	
	public int getquiz3() {
		return quiz3 * 10;
	}
	
	public int getmid() {
		return mid;
	}
	
	public int getfin() {
		return fin;
	}
	
	// Method for calculating overall average
	public double calculate() {
		quizavg = (quiz1 + quiz2 + quiz3) / 3;
		overall = (double)fin * 0.4 + (double)mid * 0.35 + (quizavg * 10) * 0.25;
		
		return overall;
	}
	
	// Method for calculating letter grade
	public char grade(double overall) {
		if(overall >= 90) {
			grade = 'A';
		}
		else if((overall >= 80) && (overall < 90)) {
			grade = 'B';
		}
		else if((overall >= 70) && (overall < 80)) {
			grade = 'C';
		}
		else if((overall >= 60) && (overall < 70)) {
			grade = 'D';
		}
		else if(overall < 60) {
			grade = 'F';
		}
		return grade;
	}
	
	public boolean equals(int score) {
		return (fin == score);
	}
	
	
}
