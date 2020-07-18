import java.util.*;
import java.util.Arrays;
public class EDIST
{
  static int[][] dp;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      String a=sc.next();
      String b=sc.next();
      dp=new int[a.length()+1][b.length()+1];
      for(int i=0;i<=a.length();i++)
      {
        for(int j=0;j<=b.length();j++)
        {
          dp[i][j]=-1;
        }
      }
        
      int ans=solve(a.length(),b.length(),a,b);
      /*for(int i=0;i<=a.length();i++)
      {
        for(int j=0;j<=b.length();j++)
        {
          System.out.print(dp[i][j]+" ");
        }
        System.out.println();
      }*/
      System.out.println(ans);
    }
  }
  public static int solve(int i,int j,String a,String b)
  {
       
    if(dp[i][j]!=-1) return dp[i][j];
    else if(i==0){
      dp[i][j]=j;
      return dp[i][j];
    }
    else if(j==0)
    {
      dp[i][j]=i;
      return dp[i][j];
    }
    else if(a.charAt(i-1)==b.charAt(j-1))
    {
      dp[i][j]=solve(i-1,j-1,a,b);
      return dp[i][j];
    }
    else{
      dp[i][j]=Math.min(1+solve(i-1,j,a,b),Math.min(1+solve(i,j-1,a,b),1+solve(i-1,j-1,a,b)));
      return dp[i][j];
    }
  }
      
}
          
            
          
  