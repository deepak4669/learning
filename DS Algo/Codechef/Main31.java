import java.util.Scanner;
import java.math.BigInteger;
public class Main31
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    BigInteger n=sc.nextBigInteger();
    BigInteger b=new BigInteger("1");
    while(n.compareTo(b)>0)
    {
      BigInteger f=new BigInteger("2");
      if(!((n.mod(f)).equals(BigInteger.ZERO)))
      {
        //System.out.println(n.mod(f));
        break;
      }
      else n=n.divide(f);
    }
    if(n.compareTo(b)>0) System.out.println("NIE");
    else
    System.out.println("TAK");
  }
}
      