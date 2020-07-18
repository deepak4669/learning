import java.util.Scanner;
public class MGCSET
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int m=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int[] dp=new int[n+1];
      for(int i=1;i<=n;i++)
      {
        
        if(i==1)
        {
          if(a[i-1]%m==0)
            dp[i]=1;
          else
            dp[i]=0;
        }
        else
        {
          if(a[i-1]%m==0)
          {
            dp[i]=dp[i-1]+dp[i-1]+1;
          }
          else
          {
            dp[i]=dp[i-1];
          }
        }
      }
      System.out.println(dp[n]);
    }
  }
}
          
          
        
      
      
      