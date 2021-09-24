package junior_java;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=fib(8);
System.out.println(x);
	}
public static int fib(int n)
{
	if(n==0)
		return 0;
	if(n==1)
		return 1;
	return fib(n-1)+fib(n-2);
}
}
