import java.util.Scanner;
public class BUSYMAN
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int[][] a=new int[n][2];
      for(int i=0;i<n;i++)
      {
        a[i][0]=sc.nextInt();
        a[i][1]=sc.nextInt();
      }
      int max=0;
      int count=0;
      for(int i=0;i<n;i++)
      {
        count=1;
        for(int j=0;j<n;j++)
        {
          if(a[j][0]>=a[i][1]) count++;
        }
        if(count>max) max=count;
      }
      System.out.println(max);
    }
  }
}
        
    