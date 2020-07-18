import java.util.Scanner;
public class EULER41
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long n=99999999;
    while(n>0)
    {
      String s=n+"";
      if(check(s,s.length())&&isPrime(n))
        break;
      n--;
    }
    System.out.println(n);
  }
  public static boolean check(String s,int n)
  {
    boolean[] a=new boolean[n+1];
    for(int i=0;i<n;i++)
    {
      int j=Integer.parseInt(s.substring(i,i+1));
      if(j!=0&&j<=n)
        a[j]=true;
      else
        return false;
    }
    for(int i=1;i<=n;i++)
    {
      if(!a[i]) return false;
    }
    return true;
  }
  public static boolean isPrime(long n)
  {
    for(int i=2;i<=(int)Math.sqrt(n);i++)
    {
      if(n%i==0)
        return false;
    }
    return true;
  }
}
    