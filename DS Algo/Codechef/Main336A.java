import java.util.Scanner;
public class Main336A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    if(x>0&&y>0)
      System.out.println(0+" "+(x+y)+" "+(x+y)+" "+0);
    else if(x<0&&y>0)
    {
      System.out.println(-(y-x)+" "+0+" "+0+" "+(y-x));
    }
    else if(x<0&&y<0)
    {
      System.out.println((x+y)+" "+0+" "+0+" "+(x+y));
    }
    else{
      System.out.println(0+" "+(y-x)+" "+(x-y)+" "+0);
    }
  }
}
  