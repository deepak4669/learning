import java.util.Scanner;
public class BoyorGirl
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int count=1;
    for(int i=1;i<s.length();i++)
    {
      char ch=s.charAt(i);
      if(contains(ch,i,s));
      else
        count++;
    }
   // System.out.println(count);
    if(count%2==0) System.out.println("CHAT WITH HER!");
    else System.out.println("IGNORE HIM!");
  }
  public static boolean contains(char ch,int i,String s)
  {
    for(int k=0;k<i;k++)
    {
      if(s.charAt(k)==ch) return true;
    }
    return false;
  }
}