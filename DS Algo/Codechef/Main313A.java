import java.util.*;
import java.io.*;
public class Main313A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    if(Integer.parseInt(s)>=0)
      System.out.println(s);
    else
    {
      int t=Integer.parseInt(s.substring(s.length()-2,s.length()-1));
      int q=Integer.parseInt(s.substring(s.length()-1,s.length()));
      if(t>q)
      {
        //ystem.out.println();
        String ans=s.substring(0,s.length()-2)+s.substring(s.length()-1,s.length());
        if(ans.equals("-0"))
          System.out.println(0);
        else
          System.out.println(ans);
      }
      else
        System.out.println(s.substring(0,s.length()-2)+s.substring(s.length()-2,s.length()-1));
    }
  }
}

                             
                             
  