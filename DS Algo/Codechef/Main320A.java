import java.util.Scanner;
public class Main320A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    boolean flag=true;
    if(s.charAt(0)!='1') System.out.println("NO");
    else{
      int prev=1;
        for(int i=1;i<s.length();i++)
        {
          if(s.charAt(i)=='1')
          {
            prev=1;
          }
          else if(s.charAt(i)=='4')
          {
            if(prev==1)
            {
              prev=14;
            }
            else if(prev==14)
            {
              prev=144;
            }
            else
            {
              flag=false;
              break;
            }
          }
          else
          {
            flag=false;
            break;
          }
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
  }
}
            
            
        
        
    