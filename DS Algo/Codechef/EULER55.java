import java.math.BigInteger;
public class EULER55
{
  public static void main(String[] args)
  {
    //Scanner sc=new Scanner(System.in);
    int cnt=0;
    for(int i=11;i<=10000;i++)
    {
      if(lychrel(i))
      {
        //System.out.println(i);
        cnt++;
      }
    }
    System.out.println(lychrel(47));
    //System.out.println(reverse("1234"));
    System.out.println(cnt);
  }
  public static String reverse(String s)
  {
    String t="";
    for(int i=s.length()-1;i>=0;i--)
    {
      t+=s.charAt(i);
    }
    return t;
  }
  public static boolean lychrel(int x)
  {
    int cnt=0;
    BigInteger a=BigInteger.valueOf(x);
      
    for(int i=0;i<50;i++)
    {
      
      String s=new String();
        
      s=a.toString();
      String t=new String();
      t=reverse(s);
      BigInteger k=new BigInteger(t);
      a=k.add(a);
      String st=new String();
      st=a.toString();
      
      if(st.equals(reverse(st)))
        return false;
      
      
    }
    return true;
  }
}
   
    
    
    