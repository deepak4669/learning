import java.util.Scanner;
public class XORSUBAC
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
      {
        a[i]=sc.nextInt();
      }
      int[][] dp=new int[n+1][1024];
      dp[0][0]=1;
      long max=0;
      for(int i=1;i<=n;i++)
      {
        for(int j=0;j<=1023;j++)
        {
          dp[i][j]=dp[i-1][j]|dp[i-1][a[i-1]^j];
          if(dp[i][j]*(j^k)>max) max=dp[i][j]*(j^k);
        }
      }
      System.out.println(max);
    }
  }
}
  
        
     