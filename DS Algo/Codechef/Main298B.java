import java.util.Scanner;
public class Main298B
{
  static String s;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    long sx=sc.nextInt();
    long sy=sc.nextInt();
    long ex=sc.nextInt();
    long ey=sc.nextInt();
    s=sc.next();
    long x=(ex-sx);
    long y=(ey-sy);
    if(x>=0&&y>=0)
    {
      
      int time=find(x,y,'E','N');
      System.out.println(time);
      
    }
    else if(x>=0&&y<=0)
    {
      int time=find(x,Math.abs(y),'E','S');
      System.out.println(time);
    }
    else if(x<=0&&y>=0)
    {
      int time=find(Math.abs(x),y,'W','N');
      System.out.println(time);
    }
    else if(x<=0&&y<=0)
    {
      int time=find(Math.abs(x),Math.abs(y),'W','S');
      System.out.println(time);
    }
  }
  public static int find(long x,long y,char x_dir,char y_dir)
  {
    int time=0;
    for(int i=0;i<s.length();i++)
    {
      if(x==0&&y==0)
        break;
      if(s.charAt(i)==x_dir&&x>0)
        x--;
      if(s.charAt(i)==y_dir&&y>0)
        y--;
      time++;
      
    }
    return x==0&&y==0?time:-1;
  }
}
        
        
      
      
        
        
      
      