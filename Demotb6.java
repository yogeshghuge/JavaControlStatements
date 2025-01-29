class Demotb6
{
	public static void main(String args[])
	{
		int a=5,b=10,c=20,d=34,e=56,f=50;
               int r = (a>b) ? (a>c) ? (a>d) ? (a>e) ? (a>f) ? a:f: (e>f) ? e:f: (d>e) ? (d>f) ? d:f: (c>d)?(c>e) ? c:e: (d>e)? d:e:(b>c) ? (b>d) ? (b>e) ? (b>f) ? b:f: (e>f) ? e:f: (d>e) ? (d>f) ? d:f: (c>d) ? (c>e) ? c:e: (d>e)? d:e:

        System.out.println("The bigger number is " + r);
    }
}
