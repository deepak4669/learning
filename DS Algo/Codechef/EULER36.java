import java.util.Scanner;
public class EULER36
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long ans=0;
    for(int i=1;i<=1000000;i++)
    {
      String s=i+"";
      String t=Integer.toBinaryString(i);
      if(palin(s)&&palin(t))
        ans+=i;
    }
    System.out.println(ans);
  }
  public static boolean palin(String s)
  {
    String reverse="";
    for(int i=s.length()-1;i>=0;i--)
      reverse+=s.charAt(i);
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)!=reverse.charAt(i))
        return false;
    }
    return true;
  }
}
        