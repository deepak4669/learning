import java.util.Scanner;
import java.util.Arrays;
public class PINS
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      if(n==1)
      {
        System.out.println(1+" "+1);
        continue;
      }
      else
      {
        if(n%2==0)
        {
          char[] ch=new char[n/2+1];
          Arrays.fill(ch,'0');
          ch[0]='1';
          String res=new String(ch);
          System.out.println(1+" "+res);
        }
        else
        {
          char[] ch=new char[n-(n/2)];
          Arrays.fill(ch,'0');
          ch[0]='1';
          String res=new String(ch);
          
          System.out.println(1+" "+res);
        }
      }
    }
  }
}
   