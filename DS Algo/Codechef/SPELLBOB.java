import java.util.Scanner;
public class SPELLBOB
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      String up=sc.next();
      String down=sc.next();
      int b=2;
      int o=1;
      int count=0;
      boolean flag=true;
      for(int i=0;i<3;i++)
      {
        char a=up.charAt(i);
        char b1=down.charAt(i);
        if(a!='b'&&a!='o'&&b1!='b'&&b1!='o')
        {
          flag=false;
          break;
        }
        if(a=='b'&&b1=='o'||a=='o'&&b1=='b')
        {
          count++;
          continue;
        }
        if(a=='b'||b1=='b') b--;
        if(a=='o'||b1=='o') o--;
      }
      if(!flag) System.out.println("no");
      else if(o==0&&b==0&&flag) System.out.println("yes");
      else if(count>0)
      {
        if(Math.abs(o)+Math.abs(b)-count==0) System.out.println("yes");
        else System.out.println("no");
      }
      else System.out.println("no");
    }
  }
}
      
      