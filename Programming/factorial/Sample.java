class samp
{
static void fc(int fact)
{
for(int i=1;i<=10;i++)
{
if(i%2==1)
{
fact=fact*i;
System.out.println(fact);
}
}
}
}
class Sample
{
public static void main(String[]args)
{
samp.fc(1);
}
}