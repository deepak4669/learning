import java.util.Scanner;
import java.util.Arrays;
public class PRMDIV
{
  static boolean[] prime;
  public static void main(String[] args)
  {
    
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int count=0;
      Arrays.sort(a);
      sieve(a[n-1]);
      for(int i=n-1;i>=0;i--)
      {
        for(int j=i-1;j>=0;j--)
        {
          //if(i==j) continue;
          int sum1=sum(a[i]);
          int sum2=sum(a[j]);
          if(a[i]%a[j]==0&&sum1%sum2==0)
            count++;
        }
      }
      System.out.println(count);
    }
  }
  public static void sieve(int n)
  {
    prime=new boolean[n+1];
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(n);
    
    for (int i=2; i<=m; i++)
      if (prime[i])
      for (int k=i*i; k<=n; k+=i)
      prime[k]=false;
    
    
  }
  public static int sum(int n)
  {
    int ans=0;
    for(int i=1;i<=n;i++)
    {
      if(prime[i]&&(n%i)==0)
        ans+=i;
    }
    return ans;
  }
}

      
                       