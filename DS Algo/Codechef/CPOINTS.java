import java.util.Scanner;
public class CPOINTS
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[100000000];
    for(int i=0;i<n;i++)
    {
      int d=sc.nextInt();
      int b=sc.nextInt();
      for(int j=d;j<=b;j++)
      {
        a[j]++;
      }
    }
    for(int i=1;i<=n;i++)
    {
      int count=0;
      for(int j=0;j<a.length;j++)
      {
        if(a[j]==i) count++;
      }
      System.out.print(count+" ");
    }
  }
}
    