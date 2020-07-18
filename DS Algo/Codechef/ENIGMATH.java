import java.util.Scanner;
public class ENIGMATH
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int y=a/(gcd(a,b));
      int x=b/(gcd(a,b));
      System.out.println(x+" "+y);
    }
  }
  public static int gcd(int a,int b)
  {
    if(b==0) return a;
    return gcd(b,a%b);
  }
}