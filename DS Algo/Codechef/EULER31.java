import java.util.Scanner;
public class EULER31
{
  public static void main(String[] args)
  {
    int f=1000000007;
    Scanner sc=new Scanner(System.in);
    int[] a={1,2,5,10,20,50,100,200};
    int sum=100000;
    int[][] A=new int[9][100001];
    for(int i=1;i<=8;i++)
    {
      for(int j=1;j<=100000;j++)
      {
        if(i==1)
        {
          if(j%i==0) A[i][j]=1;
        }
        else
        {
          if(a[i-1]>j)
            A[i][j]=A[i-1][j]%f;
          else {
            if(j%a[i-1]==0)
            {
              if(a[i-1]!=j)
                A[i][j]=(A[i][j-a[i-1]]+A[i-1][j])%f;
              else
                A[i][j]=(A[i-1][j]+1)%f;
            }
            
            else
              A[i][j]=(A[i][j-a[i-1]]+A[i-1][j])%f;
          }
        }
      }
    }
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      System.out.println(A[8][n]);
    }
    //System.out.println(A[8][100000]);
  }
}
                               
            
      