import java.math.BigInteger;
import java.util.Scanner;
public class EULER16
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      BigInteger f=new BigInteger("2");
      String s=f.pow(n).toString();
      int ans=0;
      for(int i=0;i<s.length();i++)
      {
        ans+=Integer.parseInt(s.substring(i,i+1));
      }
      System.out.println(ans);
    }
  }
}