package grade;

public class student {
	private int kor, eng, mat;
	private double avg;
	
	public void init(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.avg = (kor*1.0 + eng*1.0 + mat*1.0)/3.0;
		
	}
	
	public String getpass() {
		
		if( kor > 40 && eng > 40 && mat > 40 && avg > 60)
			return "P";
		return "F";
	}
}
