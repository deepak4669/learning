import java.util.Scanner;
import java.util.Vector;
public class EULER33
{
  static Vector<Integer> num=new Vector<Integer>();
  static Vector<Integer> den=new Vector<Integer>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    for(int i=10;i<=99;i++)
    {
      for(int j=i+1;j<=99;j++)
      {
        String s=i+"";
        String t=j+"";
        if(s.substring(0,1).equals(t.substring(1,2)))
        {
          int g=gcd(i,j);
          int a=Integer.parseInt(s.substring(1,2));
          int b=Integer.parseInt(t.substring(0,1));
          int g2=gcd(a,b);
          if(i/g==a/g2&&j/g==b/g2)
          {
            num.add(i/g);
            den.add(j/g);
          }
        }
        else if(s.substring(1,2).equals(t.substring(0,1)))
        {
          int g=gcd(i,j);
          int a=Integer.parseInt(s.substring(0,1));
          int b=Integer.parseInt(t.substring(1,2));
          int g2=gcd(a,b);
          if(i/g==a/g2&&j/g==b/g2)
          {
            num.add(i/g);
            den.add(j/g);
          }
        }
      }
    }
    int numerator=1;
    System.out.println(num.size());
    for(int w:num)
      numerator*=w;
    int denominator=1;
    for(int v:den)
      denominator*=v;
    int ans=(denominator/gcd(numerator,denominator));
    System.out.println(ans);
  }
  public static int gcd(int a,int b)
  {
    if(a==0) return b;
    else return gcd(b%a,a);
  }
}
      
             
          
          
          