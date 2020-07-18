import java.util.*;
import java.io.*;

public class RMQSQ2
{
  static int k=16;
  static int N=100000;
  static int zero=1000000001;
  
  static int[][] table=new int[N][k+1];
  static int[] arr;
  
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    //Arrays.fill(table,zero);
    
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<=k;j++)
        table[i][j]=zero;
    }
    
    
    
    
    for(int i=0;i<n;i++)
    {
      //Arrays.fill(table[i][0],zero);
      table[i][0]=arr[i];
    }
    
    for(int j=1;j<=k;j++)
    {
      for(int i=0;i<=(n-(1<<j));i++)
      {
        table[i][j]=Math.min(table[i][j-1],table[i+(1<<(j-1))][j-1]);
      }
    }
    int q=sc.nextInt();
    for(int i=0;i<q;i++)
    {
      int l=sc.nextInt();
      int r=sc.nextInt();
      int answer=zero;
      
      for(int j=k;j>=0;j--)
      {
        if(l+(1<<j)-1<=r)
        {
          //System.out.println(j);
          answer=Math.min(answer,table[l][j]);
          //System.out.println(table[l][j]);
          l+=(1<<j);
        }
      }
      System.out.println(answer);
    }
  }
}
        