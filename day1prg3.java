class day1prg3{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		if((a%400==0)||(a%100!=0)&&(a%4==0))
		{
			System.out.println(a+" is a leap year");
		}
		else
			System.out.println(a+" is not a leap year");
	}
}