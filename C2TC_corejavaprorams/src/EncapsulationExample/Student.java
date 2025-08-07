package EncapsulationExample;

public class Student {
	int sid;
	String sname;
	float avg;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", avg=" + avg + ", getSid()=" + getSid() + ", getSname()="
				+ getSname() + ", getAvg()=" + getAvg() + "]";
	}
	
	

}
