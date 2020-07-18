import java.util.Scanner;
import java.math.BigInteger;

public class EUlER58
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    long cnt=0;
    int n=1;
    //double prob=0.0;
    while(true)
    {
      BigInteger tpr=BigInteger.valueOf((2*n-1)*(2*n-1)+2*n);
      BigInteger tpl=BigInteger.valueOf((2*n-1)*(2*n-1)+4*n);
      BigInteger bl=BigInteger.valueOf((2*n-1)*(2*n-1)+6*n);
      BigInteger br=BigInteger.valueOf((2*n-1)*(2*n-1)+8*n);
      cnt+=isPrime(tpr)+isPrime(tpl)+isPrime(bl)+isPrime(br);
      //System.out.println(cnt);
      double val=Math.ceil(cnt*100/(4*n+1));
      if(val<x)
        break;
      n++;
    }
    //System.out.println(prob);
    System.out.println(2*n+1);
  }
  public static int isPrime(BigInteger n)
  {
    if(n.isProbablePrime(10))
        return +1;
      else
          return 0;
  }
}
        
      