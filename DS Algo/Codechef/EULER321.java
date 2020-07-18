import java.util.Scanner;
import java.util.Vector;
public class EULER321
{
  static Vector<Integer> v=new Vector<Integer>();
  static Vector<String> ss=new Vector<String>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int ans=0;
    for(int i=1;i<=9999;i++)
    {
      for(int j=1;j<=99;j++)
      {
        int k=i*j;
        String s=i+""+j+""+k;
        if(check(s)&&!v.contains(k))
        {
          ans+=k;
          ss.add(s);
          v.add(k);
        }
       
        
      }
    }
    for(String s:ss)
      System.out.println(s);
    System.out.println(ans);
    System.out.println(check("391867254"));
  }
  public static boolean check(String s)
  {
    boolean[] a=new boolean[10];
    for(int i=0;i<s.length();i++)
    {
      int x=Integer.parseInt(s.substring(i,i+1));
      if(a[x]||x==0) return false;
      else a[x]=true;
    }
    for(int i=1;i<=9;i++)
    {
      if(!a[i])
        return false;
    }
    return true;
  }
}
        
  