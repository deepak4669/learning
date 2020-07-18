import java.util.Scanner;
import java.lang.*;
public class StringOperation
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    /*int t=sc.nextInt();
    String a=sc.next();//For taking input as String with Spaces
    String b=sc.next();
    System.out.println(a);
    System.out.println(b);
    System.out.println(t);
    System.out.println(Character.getNumericValue(a.charAt(1)));*/
    //System.out.println(Math.pow(2,10));
    String a=sc.nextLine();
    System.out.println(a.substring(0,a.length()-1));
    String s=a.charAt(a.length()-1)+""+a.charAt(a.length()-2);
    System.out.println(s);
  }
}
    
   