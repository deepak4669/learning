import java.util.Scanner;
import java.util.Arrays;
public class COINCHANGE
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] c=new int[m];
    for(int i=0;i<m;i++)
    {
      c[i]=sc.nextInt();
    }
    long[][] A=new long[n+1][m+1];
    Arrays.sort(c);
    for(int i=0;i<=n;i++)
    {
      for(int j=0;j<=m;j++)
      {
        if(i==0) A[i][j]=0;
        else if(j==0) A[i][j]=0;
        else if(j==1){
          if(c[0]<=i&&i%c[0]==0)
            A[i][j]=1;
          else A[i][j]=0;
        }
        else
        {
          if(c[j-1]>i)
            A[i][j]=A[i][j-1];
          else if(c[j-1]<i)
            A[i][j]=A[i][j-1]+A[i-c[j-1]][j];
          else
            A[i][j]=A[i][j-1]+1;
        }
      }
    }
    /*
    for(int i=0;i<=n;i++)
    {
      for(int j=0;j<=m;j++)
      {
        System.out.print(A[i][j]+" ");
      }
      System.out.println();
    }
    */
    System.out.println(A[n][m]);
  }
}
          