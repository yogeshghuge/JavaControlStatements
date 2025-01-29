class ThreeNo
{
	public static void main(String args[])
	{
		int a=12,b=17,c=20;
		if(a>b)
			if(a>c)
				System.out.println("A is bigger");
			else
				System.out.println("C is bigger");
		else
			if(b>c)
				System.out.println("B is bigger");
			else
				System.out.println("C is bigger");
	}
}