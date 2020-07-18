import java.util.Scanner;
import java.util.Arrays;

public class EULER103
{
  public static void main(String[] args)
  {
    preprocess();
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      System.out.println(sum[n]);
    }
  }
  static boolean prime[]=new boolean[1000001];
  static long[] sum=new long[1000001];
  public static void preprocess()
  {
    Arrays.fill(prime, true);
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
    sum[0]=0;
    sum[1]=0;
    sum[2]=2;
    for(int i=3;i<=1000000;i++)
    {
      if(prime[i])
        sum[i]=i+sum[i-1];
      else
        sum[i]=sum[i-1];
    }
  }
}