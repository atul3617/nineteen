class Loop
{
public static void main(String[]args)
{
char ch='a';
for(int i=1;i<=5;i++)
{
if(i%2!=0)
{
System.out.print(ch+""+i);
ch++;
}
else
{
System.out.print(" "+i+""+ch+" ");
ch++;}

}
}
}