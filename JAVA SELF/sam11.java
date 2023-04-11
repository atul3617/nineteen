class sam11
{
	String c_colour;
	int c_cost;
	String size;
public static void main(String[]args)
{
	sam11 s1=new sam11();
	s1.c_colour="blue";
System.out.println("colours"+s1.c_colour);
    s1.c_colour="black";
	System.out.println("colours"+s1.c_colour);
	sam11 s2=new sam11();
	s2.c_cost=45000;
System.out.println("cost"+s2.c_cost);
   sam11 s3=new sam11();
      s3.size="xl";
   System.out.println("options"+s3.size);
}
}