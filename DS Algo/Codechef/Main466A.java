import java.util.Scanner;
public class Main466A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    if((double)b/(m)>=a)
      System.out.println(a*n);
    else
    {
      if(n%m==0)
        System.out.println((n/m)*b);
      else
      {
        int x=n%m;
        //System.out.println(x);
        if(x*a<b)
          System.out.println((n/m)*b+x*a);
        else
          System.out.println((n/m)*b+b);
        
        
      }
    }
  }
}
      