import java.util.Scanner;
public class Main110044
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int m=sc.nextInt();
      int ans=((n/3)*(m/3));
      System.out.println(ans);
    }
  }
}