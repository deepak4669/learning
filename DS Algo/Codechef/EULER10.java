import java.util.Scanner;
import java.util.Arrays;
public class EULER10
{
  static boolean[] prime=new boolean[10000001];
  public static void sieve(int n)
  {
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(n);
    for(int i=2;i<=m;i++)
    {
      if(prime[i])
      {
        for(int j=i*i;j<=n;j+=i)
          prime[j]=false;
      }
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    sieve(10000000);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      long ans=0;
      for(int i=2;i<=n;i++)
      {
        if(prime[i])
          ans+=i;
      }
      System.out.println(ans);
    }
  }
}
      