import java.util.Scanner;
public class ARITH2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      String a=sc.next();
      String b=sc.next();
      long ans=Integer.parseInt(a);
      //System.out.println(a);
      //System.out.println(b);
      while(!b.equals("="))
      {
        String c=sc.next();
        //System.out.println(c);
        if(b.equals("+")) ans=(ans+Integer.parseInt(c));
        else if(b.equals("-")) ans=(ans-Integer.parseInt(c));
        else if(b.equals("*")) ans=(ans*Integer.parseInt(c));
        else if(b.equals("/")) ans=(ans/Integer.parseInt(c));
        
        b=sc.next();
        
        
        
      }
      System.out.println(ans);
    }
  }
  
}
                
            
     