import java.util.Scanner;
public class Main476A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    if(n<m) System.out.println(-1);
    else
    {
      int min=(int)Math.ceil((double)n/2);
      //int i=min;
      int ans=((int)Math.ceil((double)min/m))*m;
      System.out.println(ans);
    }
  }
}
          