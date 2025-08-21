package day3.entity;

public class Student {
	private int sid;
	private String sname;
	
	public Student()
	{
		this(11,"dhayalan");
		System.out.println("constructor called..");
	}
	public Student(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
}
