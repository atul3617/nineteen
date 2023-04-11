class Mmt
{
static String login()
{
return "welcome";
}
static String journey()
{
	String a=ladak();
	String b=route();
System.out.println(a);
System.out.println(b);
return "B.confirmed";
}
static String ladak()
{
return "details";
}
static String route()
{
//String y="bike is readyyy";
//System.out.println(y);
return "travel.r";
}
public static void main(String[]args)
{
String a=login();
System.out.println(a);
String b=journey();
System.out.println(b);
String z=feedback();
System.out.println(z);
}
static String feedback()
	{
return "how's was your expreience sir";
}
}