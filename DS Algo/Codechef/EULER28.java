import java.util.Scanner;
public class EULER28
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int down=1;
    int left=2;
    int up=2;
    int right=3;
    int[][] a=new int[n][n];
    a[n/2][n/2]=1;
    int i=n/2;
    int j=n/2+1;
    int val=2;
    int t=n/2;
    while(t-->0)
    {
      int k=down;
      //System.out.println("k");
      while(k>0)
      {
        a[i++][j]=val++;
        k--;
      }
      //i--;
      down+=2;
      k=left;
      while(k>0)
      {
        a[i][j--]=val++;
        k--;
      }
      //j++;
      left+=2;
      k=up;
      while(k>0)
      {
        a[i--][j]=val++;
        k--;
      }
      up+=2;
      //i++;
      k=right;
      while(k>0)
      {
        a[i][j++]=val++;
        k--;
      }
      //j--;
      right+=2;
    }
    //for(int p=0;p<n;p++)
    //{
    //  for(int q=0;q<n;q++)
    //    System.out.print(a[p][q]+"   ");
    //  System.out.println();
    //}
    i=0;j=0;
    int sum=0;
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        if(i==j)
          sum+=a[i][j];
        else if(i==Math.abs(n-1-j)||j==Math.abs(n-1-i))
          sum+=a[i][j];
      }
    }
    System.out.println(sum);
    
  }
}
    
      