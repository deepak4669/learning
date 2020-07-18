import java.util.Scanner;
public class Main75A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    String c=""+(Integer.parseInt(a)+Integer.parseInt(b));
    String a1="";
    for(int i=0;i<a.length();i++)
    {
      if(a.charAt(i)!='0')
        a1+=a.charAt(i);
    }
    String b1="";
    for(int i=0;i<b.length();i++)
    {
      if(b.charAt(i)!='0')
        b1+=b.charAt(i);
    }
    String c1="";
    for(int i=0;i<c.length();i++)
    {
      if(c.charAt(i)!='0')
        c1+=c.charAt(i);
    }
    if(Integer.parseInt(a1)+Integer.parseInt(b1)==Integer.parseInt(c1))
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}
      
    
        