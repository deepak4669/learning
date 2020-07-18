import java.util.*;
public class UVA374
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext())
    {
      long a=sc.nextLong();
      long b=sc.nextLong();
      long c=sc.nextLong();
      long ans=binPow(a,b,c);
      System.out.println(ans);
    }
  }
  public static long binPow(long a,long b,long c)
  {
    long res=1;
    while(b>0)
    {
      if(b%2!=0)
      {
        res=(res%c)*(a%c);
        res=res%c;
      }
      a=(a*a)%c;
      b/=2;
    }
    return res;
  }
}
        
      