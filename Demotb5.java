class Demotb5
{
	public static void main(String args[])
	{
		int a=110,b=120,c=130,d=140,e=50;
		/*String result=(a>b)?(a>c)?(a>d)?(a>e)?"a is bigger":"e is bigger":(d>e)?"d is bigger":"e is bigger":(c>d)?(c>e)?"c is bigger":"e is bigger":(d>e)?"d is bigger":"e is bigger":(b>c)?(b>d)?(b>e)?"b is bigger":"e is bigger":(d>e)?"d is bigger": "e is bigger":(c>d)?(c>e)?"c is bigger":"e is bigger":(d>e)?"d is bigger":"e is bigger";
		
		System.out.println(result);
	*/
/*
Wrong code

		int r=(a>b)?(a>c)?(a>d)?(a>e)? r=a:r=e:(d>e)? r=d:r=e:(c>d)?(c>e)? r=c:r=e:(d>e)? r=d:r=e:(b>c)?(b>d)?(b>e)?  r=b:r=e:(d>e)? r=d:r=e:(c>d)?(c>e)? r=c:r=e:(d>e)? r=d:r=e;
		
		System.out.println("Bigger number is"+r);
*/

int r = (a > b) ? (a > c) ? (a > d) ?(a > e) ? a : e : (d > e) ? d : e : (c > d) ? (c > e) ? c : e : (d > e) ? d : e : (b > c) ?(b > d)?(b > e) ? b : e : (d > e) ? d : e : (c > d) ? (c > e) ? c : e : (d > e) ? d : e;

System.out.println("Bigger number is " + r);

}
		
}