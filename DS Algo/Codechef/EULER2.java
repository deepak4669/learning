import java.util.Scanner;
import java.util.HashMap;
public class EULER2
{
  static HashMap<Long,Long> map=new HashMap<Long,Long>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      
      long n=sc.nextLong();
      long i=1;
      long sum=0;
      long k=fib(i);
      while(fib(i)<=n)
      {
        k=fib(i++);
        //System.out.println(k);
        if(k%2==0) sum+=k;
      }
      System.out.println(sum);
    }
  }
  public static long fib(long n)
  {
    if(map.containsKey(n)) return map.get(n);
    if(n<=2) return n;
    else {
      long ans=fib(n-1)+fib(n-2);
      map.put(n,ans);
      return ans;
    }
  }
}