import java.util.Scanner;
import java.util.Arrays;
public class Main455A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int[] cnt=new int[100001];
    for(int i=0;i<n;i++)
    {
      
      a[i]=sc.nextInt();
      cnt[a[i]]++;
    }
    long[] dp=new long[100001];
    dp[0]=0;
    dp[1]=cnt[1];
    for(int i=2;i<=100000;i++)
    {
      dp[i]=Math.max(dp[i-1],dp[i-2]+(long)cnt[i]*i);
    }
    System.out.println(dp[100000]);

      
    
  }
  
}
    