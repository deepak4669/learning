import java.util.Scanner;
public class Main11565
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
      int x=-100;
      int y=-100;
      int z=-100;
      boolean flag=false;
      for( x=-100;x<=100&&(!flag);x++)
      {
        for( y=-100;y<=100&&(!flag);y++)
        {
          for(z=-100;z<=100&&(!(flag));z++)
          {
            if(x!=y&&z!=x&&y!=z&&(x+y+z)==a&&(x*y*z)==b&&(x*x+y*y+z*z==c))
            {
              flag=true;
            }
          }
        }
      }
      if(flag)
      {
        System.out.println((x-1)+" "+(y-1)+" "+(z-1));
      }
      else
      {
        System.out.println("No solution.");
      }
    }
  }
}
        
              
                       
                       