import java.util.Scanner;
public class Main6
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int[] res=new int[t];
    for(int i=0;i<t;i++)
    {
      int a=sc.nextInt();
      res[i]=zeros(a);
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
  
  public static int zeros(int a)
  {
    int res=0;
    int res2=0;
    int b=a;
    int c=2;
    int d=5;
    while((b/c)>0)
    {
      res+=(b/c);
      c*=2;
    }
    b=a;
    while((b/d)>0)
    {
      res2+=(b/d);
      d*=5;
    }
    return res2;
  }
}
      
  