import java.util.Scanner;
public class Main186A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    if(s.length()!=t.length())
    {
      System.out.println("NO");
    }
    else
    {
      int count=0;
      int[] index=new int[100000];
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)!=t.charAt(i))
          index[count++]=i;
      }
      if(count==2)
      {
        if(s.charAt(index[0])==t.charAt(index[1])&&s.charAt(index[1])==t.charAt(index[0]))
          System.out.println("YES");
        else
          System.out.println("NO");
      }
      else
        System.out.println("NO");
    }
  }
}