import java.util.Scanner;
public class EULER18
{
  static int[][] dp;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int[][] a=new int[n][n];
      dp=new int[n][n];
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<=i;j++)
        {
          a[i][j]=sc.nextInt();
        }
      }
      int ans=solve(0,0,a,n);
      System.out.println(ans);
    }
  }
  public static int solve(int i, int j,int[][] a,int n)
  {
    if(i<j||i>=n||j>=n) return 0;
    else if(dp[i][j]!=0) return dp[i][j];
    else
    {
      dp[i][j]=Math.max(solve(i+1,j,a,n),solve(i+1,j+1,a,n))+a[i][j];
      return dp[i][j];
    }
  }
}
    
      