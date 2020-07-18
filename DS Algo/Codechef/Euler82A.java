import java.io.*;
import java.util.*;
public class Euler82A
{
  public static int[][] sol;
  public static int n;
  public static boolean[][] marked;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    n=5;
    int[][] a=new int[n][n];
    sol=new int[n][n];
    marked=new boolean[n][n];
    for(int i=0;i<n;i++)
    {
      String s=sc.next();
      String[] numbers=s.split(",");
      
      for(int j=0;j<n;j++)
      {
        a[i][j]=Integer.parseInt(numbers[j]);
      }
    }
    for(int i=0;i<n;i++)
    {
      sol[i][0]=a[i][0];
    }
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++)
    {
      sol[i][n-1]=dp(a,i,n-1);
      if(sol[i][n-1]<min)
        min=sol[i][n-1];
      for(int j=0;j<n;j++)
      {
        for(int k=0;k<n;k++)
          marked[j][k]=false;
      }
      for(int j=1;j<n;j++)
      {
        for(int k=0;k<n;k++)
          sol[j][k]=0;
      }
      
         
      
    }
    System.out.println(min);
  }
  public static int dp(int[][] a,int i,int j)
  {
    if(i<0||i>=n||j<0||j>=n) return Integer.MAX_VALUE;
    else if(sol[i][j]>0) return sol[i][j];
    else
    {
      marked[i][j]=true;
      if(j==n-1)
      {
        sol[i][j]=a[i][j]+dp(a,i,j-1);
      }
      else
      {
        int min=Integer.MAX_VALUE;
        if(check(i-1,j)&&!marked[i-1][j])
        {
          min=Math.min(min,dp(a,i-1,j));
        }
        if(check(i+1,j)&&!marked[i+1][j])
        {
          min=Math.min(min,dp(a,i+1,j));
        }
        if(check(i,j-1)&&!marked[i][j-1])
        {
          min=Math.min(min,dp(a,i,j-1));
        }
        if(min==Integer.MAX_VALUE)
        {
          sol[i][j]=a[i][j];
        }
        else
          sol[i][j]=a[i][j]+min;
        
          
      }
      return sol[i][j];
    }
  }
  public static boolean check(int i, int j)
  {
    return i<0||i>=n||j<0||j>=n?false:true;
  }
}
                                   
    
    