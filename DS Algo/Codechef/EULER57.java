import java.util.Scanner;
import java.math.BigInteger;
import java.util.*;
public class EULER57
{
  static HashMap<Integer,String[]> map=new HashMap<Integer,String[]>();
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int cnt=0;
    Vector<Integer> ans=new Vector<Integer>();
   
    for(int i=1;i<=n;i++)
    {
      String[] s=convergent(i);
      if(s[0].length()>s[1].length())
      {
        cnt++;
        ans.add(i);
        //System.out.println(s[0]+" "+s[1]);
      }
      //System.out.println(s[0]+" "+s[1]);
    }
   //System.out.println(cnt);
    for(int y:ans)
      System.out.println(y);
    
  }
  public static String[] convergent(int n)
  {
    String s[]=new String[2];
    
    
    
    
    if(n==1)
    {
      s[0]=""+3;
      s[1]=""+2;
    }
    else if(map.containsKey(n)){
      
      return map.get(n);
    }
    else
    {
      String[] t=new String[2];
      t=convergent(n-1);
      BigInteger num=new BigInteger(t[0]);
      BigInteger den=new BigInteger(t[1]);
      BigInteger tw=new BigInteger("2");
      s[0]=tw.multiply(den).add(num).toString();
      s[1]=num.add(den).toString();
      
        
     
    }
    map.put(n,s);
    return s;
  }
}
      
      
      
  
  

    