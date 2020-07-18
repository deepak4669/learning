import java.util.Scanner;
public class Translation
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    String rev="";
    for(int i=a.length()-1;i>=0;i--)
    {
      rev+=a.charAt(i);
    }
    if(rev.equals(b)) System.out.println("YES");
    else System.out.println("NO");
  }
}
  