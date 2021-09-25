package junior_java;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=fac(5);
System.out.println(x);
System.out.println("hello");
		System.out.println("second modification");
}
public static int fac(int n)
{
	if(n==0||n==1)
		return 1;
	return n*fac(n-1);
}
}
