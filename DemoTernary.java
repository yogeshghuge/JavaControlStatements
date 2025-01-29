class DemoTernary
{
	public static void main(String args[])
	{
		double p=97.98;
		String result=(p>=70)?"Distinction":(p>=60)?"First class":(p>50)?"Second class":(p>40)?"Third class":"Failed";
		
		System.out.println(result);
	}
}