import java.util.Scanner;
//import java.math.BigInteger;
//import java.util.StringBuilder;
public class BEENUMS
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    //StringBuilder s=new StringBuilder();
    while(true)
    {
      long n=sc.nextLong();
      if(n==-1) break;
      long r=3+(long)Math.sqrt(12*n-3);
      if(r%6==0) System.out.println("Y");
      else System.out.println("N");
    }
  }
 
}
        