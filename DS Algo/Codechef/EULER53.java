import java.math.BigInteger;
public class EULER53
{
  public static void main(String[] args)
  {
    int count=0;
    for(int i=1;i<=100;i++)
    {
      for(int j=i;j>=0;j--)
      {
        if(comb(i,j))
          count++;
      }
    }
    System.out.println(count);
    
          
  }
  static boolean comb(int n,int r)
  {
    BigInteger t=fact(n);
    BigInteger u=fact(n-r);
    BigInteger s=fact(r);
    BigInteger ans=t.divide(u).divide(s);
    BigInteger mil=new BigInteger("1000000");
    if(ans.compareTo(mil)<=0) return false;
    else return true;
 
    //return Integer.parseInt(ans.toString());
  }
  static BigInteger fact(int n)
  {
    BigInteger f=new BigInteger("1");
    while(n>1)
    {
      f=f.multiply(BigInteger.valueOf(n));
      n--;
    }
    return f;
  }
}

  