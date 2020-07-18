import java.util.Scanner;
public class SPLST2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();
      boolean flag=false;
      
      if(0<=(x-a)&&(x-a)<=b&&(c+b-y==(x-a))||0<=(y-a)&&(y-a)<=b&&(c+b-x==(y-a)))
        flag=true;
      if(0<=(x-b)&&(x-b)<=a&&(c+a-y)==(x-b)||0<=(y-b)&&(y-b)<=a&&(c+a-x)==(y-b))
        flag=true;
      if(0<=(x-a)&&(x-a)<=c&&(b+c-y)==(x-a)||0<=(y-a)&&(y-a)<=c&&(b+c-x)==(y-a))
        flag=true;
      if(flag)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }
}
      