import java.util.*;
import java.io.*;//AC
public class MAXEP2
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  
  public static void main(String[] args)
  {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=sc.nextInt();
    int coins=1000;
    int r=n;
    int l=1;
    boolean flag=true;
    while(r>l&&coins>0&&flag)
    {
      //out.println(r-l+" "+coins);
     if(r-l<=coins)
        {
          while(coins>0)
          {
            out.println("1 "+l);
            out.flush();
            coins--;
            int b=sc.nextInt();
            if(b==0)
              l++;
            else
            {
              if(coins>=c)
              {
                out.println("2");
                out.flush();
              }
              break;
            }
        
          }
          flag=false;
        }
        
     else{  
      int m1=l+(r-l)/4;
      int m2=r-2*((r-l)/4);
      int m3=r-(r-l)/4;
      out.println(1+" "+m1);
      out.flush();
      coins-=1;
      int a=sc.nextInt();
      if(a==1)
      {
        r=m1;
        if(coins<c) break;
        coins-=c;
        out.println(2);
        out.flush();
        
        continue;
      }
      l=m1+1;
      if(coins<=0) break;
      out.println(1+" "+m2);
      out.flush();
      
      coins-=1;
      int b=sc.nextInt();
      if(b==1)
      {
        r=m2;
        if(coins<c) break;
        out.println(2);
        out.flush();
        coins-=c;
        continue;
      }
      l=m2+1;
      if(coins<=0) break;
      out.println(1+" "+m3);
      out.flush();
      
      coins-=1;
      int d=sc.nextInt();
      if(d==1)
      {
        r=m3;
        if(coins<c) break;
        out.println(2);
        out.flush();
        coins-=c;
      }
      else
      {
        l=m3+1;
      }
        
        
     }
 
    }
    out.println(3+" "+l);
    out.flush();
  }
}
      
        
        
      