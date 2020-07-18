import java.util.Scanner;
import java.util.HashMap;
public class ACODE
{
  static HashMap<String,Long> map =new HashMap<String,Long>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      map.clear();
      String s=sc.nextLine();
      if(s.equals("0")) break;
      
      long ans =solve(s,s.length());
      System.out.println(ans);
    }
  }
  public static long solve(String a,int n)
  {
    if(map.containsKey(a)) return map.get(a);
    if(n==1)
    {
      if(a=="0")
        return 0;
      else
        return 1;
    }
    if(n==2)
    {
      if(a.charAt(0)=='0') return 0;
      if(a.charAt(1)=='0')
      {
        
        if(a.equals("20")||a.equals("10")) return 1;
        else return 0;
      }
      int ans=Integer.parseInt(a);
      if(ans<=26) return 2;
      else return 1;
    }
    long result=0;
    if(a.charAt(a.length()-1)!='0')
    {
      result=solve(a.substring(0,n-1),n-1);
    }
    String s=a.charAt(n-2)+""+a.charAt(n-1);
    
    if(solve(s,2)==1&&s.charAt(1)=='0') result+=solve(a.substring(0,n-2),n-2);
    else if(solve(s,2)==2) result+=solve(a.substring(0,n-2),n-2);
    
    map.put(a,result);
    return result;
  }
}
    
    
   