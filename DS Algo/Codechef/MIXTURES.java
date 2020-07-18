import java.util.Scanner;
public class MIXTURES
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt())
    {
      int n=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int b[][]=new int[n][n];
      for(int i=0;i<n;i++)
      {
        for(int j=i;j<n;j++)
        {
          for(int k=i;k<=j;k++)
            b[i][j]+=a[k];
          b[i][j]=b[i][j]%100;
        }
      }
      int[][] dp=new int[n][n];
      for(int i=n-1;i>=0;i--)
      {
        for(int j=i;j<n;j++)
        {
          if(i==j) dp[i][j]=0;
          else{
            dp[i][j]=1000000000;
            for(int k=i;k<j;k++)
            {
              int value=dp[i][k]+dp[k+1][j]+b[i][k]*b[k+1][j];
              if(value<dp[i][j]) dp[i][j]=value;
            }
          } 
        }
      }
      System.out.println(dp[0][n-1]);
    }
  }
  
}
          
      