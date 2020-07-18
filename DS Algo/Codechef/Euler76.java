import java.util.*;
import java.io.*;
public class Euler76
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[101];
    for(int i=1;i<101;i++)
      a[i]=i;
    long[][] A=new long[101][101];
    
    for(int i=1;i<=100;i++)
    {
      for(int j=1;j<=100;j++)
      {
        if(i==1)
          A[i][j]=1;
        else
        {
          if(j<a[i])
            A[i][j]=A[i-1][j];
          else
          {
            if(j%a[i]==0)
            {
              if(j==a[i])
                A[i][j]=A[i-1][j]+1;
              else
                A[i][j]=A[i-1][j]+A[i][j-a[i]];
            }
            else
              A[i][j]=A[i-1][j]+A[i][j-a[i]];
          }
        }
      }
    }
    System.out.println(A[100][100]-1);
  }
}
    