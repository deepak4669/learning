import java.util.Scanner;
import java.util.Arrays;
public class CANDLES
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    Arrays.sort(a);
    int biggest=a[n-1];
    int count=0;
    for(int i=n-1;i>=0;i--)
    {
      if(a[i]==biggest) count++;
      else break;
    }
    System.out.println(count);
  }
}