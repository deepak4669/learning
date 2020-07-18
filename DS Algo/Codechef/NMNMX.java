import java.util.Scanner;
import java.util.Arrays;
public class NMNMX
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int k=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      long count=1;
      int[] b=new int[k];
      for(int i=0;i<(1<<n);i++)
      {
        int l=0;
        b=new int[k];
        if(count(i)==k)
        {
          for(int j=0;j<n;j++)
          {
            if((i&(1<<j))==(1<<j))
            {
              b[l++]=a[j];
              
              
              
            }
          }
          //System.out.println(mul(b,k));
          count=((count)*mul(b,l))%1000000007;
        }
      }
      System.out.println(count);
    }
  }
  public static int count(int a)
  {
    int count=0;
      while(a>0)
      {
        count+=(a&1);
        a>>=1;
      }
      return count;
      
    }
  public static long mul(int[] a,int n)
  {
    Arrays.sort(a);
    long ans=1;
    
    for(int i=1;i<n-1;i++)
      ans=(ans*a[i])%1000000007;
    return ans;
  }
}

              