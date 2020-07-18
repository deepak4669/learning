import java.util.Scanner;
public class Main255A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=0;
    int bi=0;
    int b=0;
    for(int i=1;i<=n;i++)
    {
      int x=sc.nextInt();
      
      if(i%3==0)
      {
        b+=x;
      }
      else if(i%3==1)
      {
        c+=x;
      }
      else
        bi+=x;
    }
    int m=Math.max(bi,Math.max(c,b));
    if(m==bi)
    {
      System.out.println("biceps");
    }
    else if(m==c)
      System.out.println("chest");
    else
      System.out.println("back");
  }
}
      