package day2prog1;
public class box {
protected int l;
protected int b;
public box() {}
public box(int x, int y) {
	l=x;
	b=y;
}
public void calarea()
{
	int area=l*b;
	System.out.println("Area="+area);
}

}
