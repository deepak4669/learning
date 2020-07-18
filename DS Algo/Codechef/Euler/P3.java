import java.math.BigInteger;
public class P3
{
  public static void main(String[] args)
  {
    BigInteger N=new BigInteger("600851475143");
    long k=N;
    while(true)
    {
      if(isPrime(k)&&N%k==0)
        break;
      k--;
    }
    System.out.println(k);
  }
  public static boolean isPrime(long n)
  {
    for(int i=2;i<=(n/i);i++)
      if(n%i==0) return false;
    return true;
  }
}
            
            