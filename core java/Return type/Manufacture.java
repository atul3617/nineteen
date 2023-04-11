class Manufacture
{
static String parts()
{
return "spare parts";
}
static String trans()
{
return "Reached to main plant";
}
static String  bill(int x)
{
String a=assemble();
return "bike is ready";
}
static String assemble()
{
String y="bike is readyyy";
System.out.println(y);
return "combine";
}
public static void main(String[]args)
{
String a=parts();
String b=trans();
       bill(38000);

}
}