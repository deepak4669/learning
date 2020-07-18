import java.util.*;
public class EULER50
{
  static boolean[] prime=new boolean[1000001];
  static Vector<Integer> primes=new Vector<Integer>();
  static boolean isPrime(long n)
  {
    if(n==2) return true;
    if(n==1) return false;
    for(int i=2;i<=Math.sqrt(n);i++)
    {
      if(n%i==0)
        return false;
    }
    return true;
  }
  
  
  static void sieve()
  {
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(1000000);
    for(int i=2;i<=m;i++)
    {
      if(prime[i])
      {
        
        for(int j=i*i;j<=1000000;j+=i)
        {
          prime[j]=false;
        }
      }
    }
    for(int i=0;i<=1000000;i++)
    {
      if(prime[i])
        primes.add(i);
    }
  }
      
  public static void main(String[] args)
  {
    sieve();
    int[] a=new int[primes.size()];
    int k=0;
    System.out.println(a.length);
    for(int j:primes)
      a[k++]=j;
    long[] sum=new long[a.length];
    sum[0]=a[0];
    for(int i=1;i<a.length;i++)
    {
      sum[i]+=sum[i-1]+(long)a[i];
      //System.out.println(sum[i]);
    }
    long ans=0;
    int max=0;
    for(int i=0;i<a.length;i++)
    {
      for(int j=i;j<a.length;j++)
      {
        if((sum[j]-sum[i])<=1000000&&prime[(int)(sum[j]-sum[i])])
        {
          if(j-i+1>max)
          {
            ans=sum[j]-sum[i];
            max=j-i+1;
          }
          //System.out.println(sum[j]-sum[i]);
        }
      }
        
    }
    System.out.println(ans);
    
    
    
  }
}
  