import java.util.Scanner;
import java.util.Arrays;
public class Main337A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=new int[m];
    for(int i=0;i<m;i++)
      a[i]=sc.nextInt();
    Arrays.sort(a);
    int best=100000;
    for(int k=0;k<=(m-n);k++)
    {
      best=best>(a[k+n-1]-a[k])?(a[k+n-1]-a[k]):best;
    }
    System.out.println(best);
  }
}
                                 
      
    