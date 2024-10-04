package program1;

public class student {
	private int rollno;
	private String name;
	private int age;
	public void setdata(int r,String s, int a)
	{
		rollno=r;
		name=s;
		age=a;
	}
	public void getdata()
	{
		System.out.println("Rollno:"+rollno+"\n"+"Name:"+name+"\n"+"Age:"+age);
	}

}
