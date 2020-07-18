import java.util.Scanner;
public class Main11078
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int best=a[0];
      int max_diff=a[0]-a[1];
      for(int i=1;i<n;i++)
      {
        if(best-a[i]>max_diff) max_diff=best-a[i];
        if(a[i]>best) best=a[i];
      }
          
        
      System.out.println(max_diff);
    }
  }
}
                       