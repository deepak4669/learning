import java.util.Scanner;
import java.util.HashSet;
public class HPYNOS
{
  static HashSet set=new HashSet();
  static int counter=0;
  public static void main(String[] args)
  {
    
    Scanner sc=new Scanner(System.in);
    counter=0;
    long n=sc.nextLong();
    solve(n);
  }
  public static void solve(long n)
  {
    int sum=0;
    if(n==1)
    {
      System.out.println(0);
      return;
    }
    
    while(n>0)
    {
      sum+=(n%10)*(n%10);
      n/=10;
    }
    //System.out.println(sum);
    counter++;
    //System.out.println(counter);
    if(sum==1)
    {
      System.out.println(counter);
      return;
    }
    if(set.contains(sum)) 
    {
      System.out.println(-1);
      return;
    }
    set.add(sum);
    solve(sum);
  }
}
    