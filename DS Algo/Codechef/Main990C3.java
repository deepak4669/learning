import java.util.*;
public class Main990C3
{
  static int[] cnt=new int[1000001];
  public static void main(String[] args)
  {
    cnt=new int[1000001];
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] s=new String[n];
    for(int i=0;i<n;i++)
    {
      s[i]=sc.next();
    }
    for(int i=0;i<n;i++)
    {
      int bal=getBalance(s[i]);
      if(bal!=-1)
        ++cnt[bal];
    }
    long res=0;
    for(int i=0;i<n;i++)
    {
      String t=reverse(s[i]);
      //System.out.println(t);
      
      int bal=getBalance(t);
      //System.out.println(bal);
      if(bal!=-1)
        res+=cnt[bal];
    }
    //System.out.println();
    System.out.println(res);
  }
  public static int getBalance(String s)
  {
    int bal=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='(')
        ++bal;
      else //if(s.charAt(i)==')')
        --bal;
      if(bal<0)
        return -1;
    }
    return bal;
  }
  public static String reverse(String s)
  {
    
    String t=rev(s);
    String rev="";
    
    
    for(int i=0;i<t.length();i++)
    {
      if(t.charAt(i)=='(')
        rev+=")";
      else
        rev+="(";
    }
    return rev;
  }
  public static String rev(String s)
  {
    String ans="";
    for(int i=s.length()-1;i>=0;i--)
    {
      ans+=s.charAt(i);
    }
    return ans;
  }
}
      
        
      