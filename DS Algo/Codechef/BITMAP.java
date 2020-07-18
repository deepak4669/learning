import java.util.Scanner;
import java.util.Arrays;
public class BITMAP
{
  static double[][] res;
  static boolean[][] marked;
  static int n,m;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      n=sc.nextInt();
      m=sc.nextInt();
      String[] s=new String[n];
      marked=new boolean[n][m];
      for(int i=0;i<n;i++)
        s[i]=sc.next();
      res=new double[n][m];
      
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          System.out.print((int)solve(i,j,s,n,m)+" ");
        }
        System.out.println();
      }
    }
  }
  public static double solve(int i,int j,String[] s,int n, int m)
  {
    
    if(i<0||i>=n||j<0||j>=m) return Double.POSITIVE_INFINITY;
    if(res[i][j]!=0.0) return res[i][j];
    else if(s[i].charAt(j)=='1'){      
      return 0;
    }
    else
    {
      
      marked[i][j]=true;
      double ans=Double.POSITIVE_INFINITY;
      
      
      
      if(valid(i+1,j)&&!marked[i+1][j])
        ans=min(ans,solve(i+1,j,s,n,m));
      
      
      if(valid(i,j-1)&&!marked[i][j-1])
        ans=min(ans,solve(i,j-1,s,n,m));
      if(valid(i,j+1)&&!marked[i][j+1])
        ans=min(ans,solve(i,j+1,s,n,m));
      if(valid(i-1,j)&&!marked[i-1][j])
        ans=min(ans,solve(i-1,j,s,n,m));
      
      ans=ans+1;
      res[i][j]=ans;
      return ans;
      
    }
    
        
      
        
        
  }
  public static boolean valid(int x,int y)
  {
    if(x>=0&&x<n&&y>=0&&y<m) return true;
    return false;
  }
    
  public static double min(double x,double y)
  {
    return x>y?y:x;
  }
  
}
      
        
                
            
            
        