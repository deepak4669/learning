import java.util.Scanner;
public class Main374
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String t="F";
    while(sc.hasNext())
    {
      long a=sc.nextLong();
      long b=sc.nextLong();
      long n=sc.nextLong();
      //t=sc.nextLine();
      //System.out.println();
      System.out.println(binPow(a,b,n));
      
    }
  }
  public static long binPow(long a,long b,long n)
  {
    if(b==0)
    {
      if(b==1)
        return 0;
      else return 1;
    }
    long res=1;
    while(b>0)
    {
      if(b%2!=0)
      {
        res=(res*a)%n;
      }
      a=(a*a)%n;
      b/=2;
    }
    return res;
  }
}