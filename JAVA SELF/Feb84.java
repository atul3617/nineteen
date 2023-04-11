class Feb84
{
static int mult(int n1,int n2)
{
	int odd=1;
	int even=1;
for(int i=n1;i<=n2;i++)
{
if (i%2==0)
{
System.out.println(i+" is even");
even=even*i;
}
else if(i%2==1)
	{
System.out.println(i+" is odd");
odd=odd*i;
}
}break;
System.out.println("Multiplication of even no is "+even);
System.out.println("Multiplication of odd no is "+odd);
return mult(1,10);
}
public static void main(String[]args)
	{
System.out.println(mult(1,10));
}
}