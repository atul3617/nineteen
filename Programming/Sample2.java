class Sample2
{
	static void odd(int s,int n1,int n2)
	{
     for(int i=n1;i<=n2;i++)
		{	
		 if(i%2==1)
      System.out.println(i);
	 s=s+i;
	 }
	  System.out.println(s);
	 }
public static void main(String[]args)
	{
	odd(0,1,20);
}
}