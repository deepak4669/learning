import java.util.Scanner;
public class Main337B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    if((double)a/b<(double)c/d)
      System.out.println((b*c-a*d)/gcd(b*c-a*d,b*c)+"/"+(b*c)/gcd(b*c-a*d,b*c));
    else if((double)a/b>(double)c/d)
      System.out.println((-b*c+a*d)/gcd(-b*c+a*d,a*d)+"/"+(a*d)/gcd(-b*c+a*d,a*d));
    else 
      System.out.println(0+"/"+1);
  }
  public static int gcd(int a, int b)
  {
    if(a==0) return b;
    else
      return gcd(b%a,a);
  }
}

    
  