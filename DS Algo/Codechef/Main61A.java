import java.util.Scanner;
public class Main61A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    String ans="";
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)!=t.charAt(i))
        ans+="1";
      else
        ans+="0";
    }
    System.out.println(ans);
  }
}