class farmer{
	void grow()
	{
		System.out.println("grow");
	}
}
class rice extends farmer{
	void grow()
	{
	System.out.println("rice ");
	}
}
class maize extends farmer{
	void grow()
	{
		System.out.println("maize");
	}
}
class ragi extends farmer{
	void grow()
	{
		System.out.println("ragi ");
	}
}
class rain{
	void rainfall(farmer f1)
	{
		f1.grow();
	}
}
class Mainclass2 {

	public static void main(String[] args)
	{
		 maize m1=new maize();
		rice r1=new rice();
		ragi n1=new ragi();
		rain p1=new rain();
		p1.rainfall(m1);
		p1.rainfall(r1);
	    p1.rainfall(n1);
	}
}