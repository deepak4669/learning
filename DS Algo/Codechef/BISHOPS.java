import java.util.Scanner;
import java.math.BigInteger;

public class BISHOPS
{
  
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    while(sc.hasNextBigInteger())
    {
      BigInteger f=new BigInteger("2");
      BigInteger n=sc.nextBigInteger();
      if(n.equals(BigInteger.ONE)) System.out.println(BigInteger.ONE);
      
      else System.out.println((f.multiply(n)).subtract(f));
            
    }
  }
  
}
     