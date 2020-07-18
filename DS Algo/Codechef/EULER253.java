import java.util.Scanner;
import java.math.*;
public class EULER253
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int N=sc.nextInt();
      double phi=(1+Math.sqrt(5))/2;
      double ans=((double)(N-1)+(Math.log10(5))/2)/(Math.log10(phi));
      System.out.println((int)Math.ceil(ans));
    }
  }
}