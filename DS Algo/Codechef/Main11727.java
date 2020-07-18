import java.util.Scanner;
import java.util.Arrays;
public class Main11727
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int k=0;
    while(t-->0)
    {
      int[] a=new int[3];
      for(int i=0;i<3;i++)
        a[i]=sc.nextInt();
      Arrays.sort(a);
      k++;
      System.out.println("Case "+k+": "+a[1]);
    }
  }
}
