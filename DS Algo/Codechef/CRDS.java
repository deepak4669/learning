import java.util.Scanner;
import java.math.BigInteger;
public class CRDS
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0)
    {
      BigInteger n=sc.nextBigInteger();
      BigInteger one=new BigInteger("1");
      BigInteger two=new BigInteger("2");
      BigInteger three=new BigInteger("3");
        
      BigInteger res=(n.multiply(two));
      BigInteger a=((three.multiply(n)).multiply(n.subtract(one))).divide(two);
      res=res.add(a);
      BigInteger f=new BigInteger("1000007");
      res=res.mod(f);
      
      
      System.out.println(res);
      t=t-1;
    }
  }
}
        