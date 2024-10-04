package day2prog1;

public class box3d extends box{
	private int h;
	public box3d() {}
	public box3d(int x,int y, int z)
	{
		super(x,y);
		this.h=z;
	}
	public void calvolume()
	{
		int v=l*b*h;
		System.out.println("Volume="+v);
	}

}
