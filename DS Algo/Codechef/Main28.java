import java.util.Scanner;
public class Main28
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int res[]=new int[t];
    
    for(int i=0;i<t;i++)
    {
      int n=sc.nextInt();
      res[i]=ans(n);
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
  public static int ans(int a)
  {
    return (192+(a-1)*250);
  }
}
      