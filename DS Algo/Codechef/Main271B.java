import java.util.Scanner;
import java.util.Arrays;
public class Main271B
{
  static boolean[] prime=new boolean[1000001];
  static int[] diff=new int[100001];
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    preprocess();
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] mat=new int[n][m];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        mat[i][j]=sc.nextInt();
      }
    }
    int min=1000000000;
    for(int i=0;i<n;i++)
    {
      int value=0;
      for(int j=0;j<m;j++)
      {
        value+=diff[mat[i][j]];
      }
      //System.out.println(value);
      if(value<min) min=value;
    }
    for(int i=0;i<m;i++)
    {
      int value=0;
      for(int j=0;j<n;j++)
      {
        value+=diff[mat[j][i]];
      }
      if(value<min) min=value;
    }
    System.out.println(min);
  }
  public static void preprocess()
  {
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(1000000);
    for(int i=2;i<=m;i++)
    {
      for(int j=i*i;j<=1000000;j+=i)
      {
        prime[j]=false;
      }
    }
    int hi=0;
    for(int i=100000;i<1000000;i++)
    {
      if(prime[i])
      {
        hi=i;
        break;
      }
    }
    for(int i=100000;i>=0;i--)
    {
      if(!prime[i]){
        diff[i]=hi-i;
      }
        
      else
      {
        diff[i]=0;
        hi=i;
      }
    }
  }
}
    
        
        
      