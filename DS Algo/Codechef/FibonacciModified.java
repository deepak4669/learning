import java.util.Scanner;
import java.util.HashMap;
import java.math.BigInteger;
public class FibonacciModified
{
  static HashMap<Integer,BigInteger> map=new HashMap<Integer,BigInteger>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t1=sc.nextInt();
    int t2=sc.nextInt();
    int n=sc.nextInt();
    BigInteger ans=fib(t1,t2,n);
    System.out.println(ans);
  }
  public static BigInteger fib(int t1,int t2,int n)
  {
    if(map.containsKey(n)) return map.get(n);
    if(n==1) return BigInteger.valueOf(t1);
    if(n==2) return BigInteger.valueOf(t2);
    BigInteger ans=fib(t1,t2,n-1).multiply(fib(t1,t2,n-1)).add(fib(t1,t2,n-2));
    map.put(n,ans);
    return ans;
  }
}

    
    