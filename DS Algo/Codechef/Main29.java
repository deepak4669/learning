import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main29
{
    public static void main(String[] args) throws IOException
    {
        try{
          Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    BigInteger res[]=new BigInteger[t];
    
    for(int i=0;i<t;i++)
    {
      BigInteger n=sc.nextBigInteger();
      res[i]=ans(n);
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
            //Your Solve
        }catch(Exception e){
            return;
        }
    }
    public static BigInteger ans(BigInteger a)
  {
      BigInteger b=new BigInteger("192");
      BigInteger c=new BigInteger("1");
      BigInteger d=new BigInteger("250");
    return b.add((a.subtract(c)).multiply(d));
  }
}