import java.util.*;
import java.lang.*;
import java.io.*;

public class Euler81A
{
  static int[][] sol;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=80;
    int[][] a=new int[n][n];
    sol=new int[n][n];
    for(int i=0;i<n;i++)
    {
      String s=sc.next();
      String[] numbers=s.split(",");
      
      
      
      for(int j=0;j<n;j++)
      {
        a[i][j]=Integer.parseInt(numbers[j]);
      }
    }
    sol[0][0]=a[0][0];
    int ans=dp(a,n-1,n-1);
    System.out.println(ans);
  }
  public static int dp(int[][] a,int i,int j)
  {
    if(i<0||j<0) return Integer.MAX_VALUE;
    else if(sol[i][j]>0) return sol[i][j];
    else
    {
      sol[i][j]=Math.min(dp(a,i-1,j),dp(a,i,j-1))+a[i][j];
    }
    return sol[i][j];
  }
}
    