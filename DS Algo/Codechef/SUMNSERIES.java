import java.util.Scanner;
public class SUMNSERIES
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int f=1000000007;
    while(t-->0)
    {
      long n=sc.nextLong();
      long ans=((n%f)*(n%f))%f;
      System.out.println(ans);
    }
  }
}
  