import java.util.Scanner;
public class NUMCOMP
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int n=sc.nextInt();
      if(n==0)
      {
        System.out.println(0);
        continue;
      }
      if(n%2==0)
      {
        if(Math.abs(a)>Math.abs(b))
          System.out.println(1);
        else if(Math.abs(a)<Math.abs(b))
          System.out.println(2);
        else 
          System.out.println(0);
      }
      else
      {
        if(a>b) System.out.println(1);
        else if(a<b) System.out.println(2);
        else System.out.println(0);
      }
    }
  }
}
        
        