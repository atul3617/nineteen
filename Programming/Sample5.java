class Sample5
{
	static int odd()
	{
		int s=0;
     for(int i=1;i<=20;i++)
		{	
		 /*if(i%2==0)
		System.out.println(i);*/
	 s=s+i;
	 }
	  //System.out.println(s);
	// return a;
	 return s;
	 }
public static void main(String[]args)
	{
	int a=odd();
	System.out.println(a);
}
}