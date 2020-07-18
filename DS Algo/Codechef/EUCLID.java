import java.util.*;

public class EUCLID
{
  public static void main(String[] args)
  {
  }
  public static int gcd(int a,int b)
  {
    if(a==0) return b;
    else return gcd(b%a,a);
  }
  public static int[] gcdex(int a,int b)
  {
    int[] sol=new int[3];
    if(a==0)
    {
      sol[0]=0;
      sol[1]=1;
      sol[2]=b;
      return sol;
    }
    int[] prev=gcdex(b%a,a);
    sol[1]=prev[0];
    sol[0]=prev[1]-(b/a)*prev[0];
    sol[2]=prev[2];
    return sol;
  }
}
      
      