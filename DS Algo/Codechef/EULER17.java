import java.util.Scanner;
public class EULER17
{
  static String[] s1={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
  static String[] s2={"0","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
  static String[] s3={"0","Hundred","Thousand","Million","Billion"};
    
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n-->0){
      String string=sc.next();
    //int ans=0;
    //for(int i=1;i<=n;i++)
    //{
     // String s=""+i;
    //  String s2=conversion(s);
    //  ans+=len(s2);
   // }
      if(string.equals("0")) System.out.println("Zero");
      else
        System.out.println(conversion(string));
    }
      
    //System.out.println(ans);
    }
  public static int len(String s)
  {
    int ans=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)!=' ')
        ans++;
    }
    return ans;
  }

  public static String conversion(String string)
  {
    int n=string.length();
    if(checkZero(string)) return "";
    if(string.equals("1000000000000"))
         return "One Trillion";
    if(n<=2)
    {
      if(string.substring(0,1).equals("0")&&n==2) return conversion(string.substring(1,2));
      else if(n==1||Integer.parseInt(string.substring(0,1))<2)
        return s1[Integer.parseInt(string)];
      else
      {
        return s2[Integer.parseInt(string.substring(0,1))]+" "+s1[Integer.parseInt(string.substring(1,2))];
      }
    }
    else if(n==3)
    {
      String ans="";
      if(string.substring(0,1).equals("0"))
        return conversion(string.substring(1,3));
      else if(string.substring(1,3).equals("00"))
        ans=s1[Integer.parseInt(string.substring(0,1))]+" "+s3[1];
      else
        ans=s1[Integer.parseInt(string.substring(0,1))]+" "+s3[1]+" "+conversion(string.substring(1,3));
      return ans;
    }
    else if(n%3==1)
    {
      int id=((n-4)/3)+2;
      String ans="";
      if(string.charAt(0)=='0') return conversion(string.substring(1,n));
      if(checkZero(string.substring(1,n)))
        ans=s1[Integer.parseInt(string.substring(0,1))]+" "+s3[id];
      else 
        ans=s1[Integer.parseInt(string.substring(0,1))]+" "+s3[id]+" "+conversion(string.substring(1,n));
      return ans;
    }
    else if(n%3==2)
    {
      int id=((n-5)/3)+2;
      String ans="";
      if(string.charAt(0)=='0') return conversion(string.substring(1,n));
      if(checkZero(string.substring(2,n)))
        ans=conversion(string.substring(0,2))+" "+s3[id];
      else
        ans=conversion(string.substring(0,2))+" "+s3[id]+" "+conversion(string.substring(2,string.length()));
      return ans;
    }
    else
    {
      int id=((n-6)/3)+2;
      String ans="";
      if(string.charAt(0)=='0') return conversion(string.substring(1,n));
      if(checkZero(string.substring(3,n)))
        ans=conversion(string.substring(0,3))+" "+s3[id];
      else
        ans=conversion(string.substring(0,3))+" "+s3[id]+" "+conversion(string.substring(3,string.length()));
      return ans;
      
    }
  }
  public static boolean checkZero(String s)
  {
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)!='0') return false;
    }
    return true;
  }
}
                         