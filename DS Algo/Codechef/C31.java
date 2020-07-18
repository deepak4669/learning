import java.util.Scanner;
public class C31
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    String t=sc.next();
    String s="";
    int depth=0;
    int lo=0;
    int ro=t.length();
    while(true)
    {
      if(lo>=ro)
        break;
      else if(t.substring(0,lo+1).equals(t.substring(ro-1,t.length())))
      {
        depth=lo+1;
      }
      lo++;
      ro--;
    }
    if(same(t))
    {
      s+=t;
      for(int i=1;i<k;i++)
        s+=t.substring(0,1);
    }
    else
    {
      s+=t;
      for(int i=1;i<k;i++)
        s+=t.substring(depth,t.length());
    }
    System.out.println(s);
  }
  public static boolean same(String s)
  {
    for(int i=0;i<s.length()-1;i++)
    {
      if(s.charAt(i)!=s.charAt(i+1))
        return false;
    }
    return true;
  }
}
    
    
        
      
      