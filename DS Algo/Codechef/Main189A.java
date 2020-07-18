import java.util.Scanner;
import java.util.Arrays;
public class Main189A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[3];
    for(int i=0;i<3;i++)
      a[i]=sc.nextInt();
    int[] dp=new int[n+1];
    Arrays.fill(dp,-1000000);
    dp[0]=0;
    for(int i=1;i<=n;i++)
    {
      for(int j=0;j<3;j++)
      {
        if(a[j]<=i&&(dp[i-a[j]]+1)>dp[i])
          dp[i]=dp[i-a[j]]+1;
      }
    }
    System.out.println(dp[n]);
  }
}