import java.util.Scanner;
class Sample
{
	void number(int no)
	{
	int copy=no;
	int rev=0;
	while(no!=0)
	{
      int rem=no%10;
	rev=(rev*10)+rem;
	
	no=no/10;
	}
	if(rev==copy){
	System.out.println("yes");
	}
	else{
	System.out.println("no");
	}
	}
 public static void main(String[] args)
	{
 Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
   Sample s=new Sample();
   s.number(a);
 }
}