import java.util.Arrays;

public class RecursionFib {
    static int []ans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		ans=new int[n+1];
		for(int i=0;i<n;i++)
		{
			System.out.print(fib(i)+" ");
		}
System.out.println(fib(n));
System.out.println(Arrays.toString(ans));
	}
    static int fib(int n)
    {
    	if(n==1||n==0)
    	{
    		ans[n]=n;
    		return n;
    	}
    	
    	int nthnumber= fib(n-1)+fib(n-2);
    	ans[n]=nthnumber;
    	return nthnumber;
    	
    	
    }
}
