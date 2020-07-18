import java.util.Scanner;
public class TimeConversion
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String res="";
    if(s.charAt(s.length()-2)=='P') {
      
      int n=Integer.parseInt(s.substring(0,2));
      if(n==12)
        res=s.substring(0,s.length()-2);
      else
       res=(n+12)+s.substring(2,s.length()-2);
    }
    else{
      int n=Integer.parseInt(s.substring(0,2));
      if(n==12){
        res="00"+s.substring(2,s.length()-2);
      }
      else
      res=s.substring(0,s.length()-2);
    }
    System.out.println(res);
  }
}
      
        