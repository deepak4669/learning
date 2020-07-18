import java.util.Scanner;
import java.math.BigInteger;
public class EULER282
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      BigInteger e=new BigInteger("8");
      BigInteger r=new BigInteger("3");
      BigInteger w=new BigInteger("2");
      BigInteger s=new BigInteger("6");
      BigInteger n=sc.nextBigInteger();
      long f=1000000007;
      //long p=(n/2);
      BigInteger x=n.divide(w);
      
      BigInteger ans=(e.multiply((x.multiply(x.add(BigInteger.ONE))).multiply((w.multiply(x)).add(BigInteger.ONE)))).divide(r).add(w.multiply(x.multiply(x))).add(s.multiply(x)).add(BigInteger.ONE);
      //long ans=((((8*(x*(x+1))%f)*(2*x+1))%f)/3)+(2*(x*x)%f)+6*x+1;
      ans=ans.mod(BigInteger.valueOf(f));
      System.out.println(ans);
    }
  }
}
      