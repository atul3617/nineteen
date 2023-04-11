class hospital{
	void treat()
	{
		System.out.println("treatment");
	}
}
class cardiology extends hospital{
	void treat()
	{
	System.out.println("cardio ");
	}
}
class ortho extends hospital{
	void treat()
	{
		System.out.println("ortho");
	}
}
class neurology extends hospital{
	void treat()
	{
		System.out.println("neuro ");
	}
}
class patients{
	void disease(hospital h1)
	{
		h1.treat();
	}
}
class Mainclass1 {

	public static void main(String[] args)
	{
		 cardiology c1=new cardiology();
		ortho o1=new ortho();
		neurology n1=new neurology();
		patients p1=new patients();
		p1.disease(c1);
		p1.disease(o1);
	    p1.disease(n1);
	}
}