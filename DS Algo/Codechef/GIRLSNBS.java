import java.util.Scanner;
public class GIRLSNBS
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      int g=sc.nextInt();
      int b=sc.nextInt();
      if(g==-1&&b==-1) break;
      if(g==b)
      {
        if(g==0)
        {
          System.out.println(0);
          continue;
        }
        System.out.println(1);
        continue;
      }        
      int max,min;
      if(g>b)
      {
        max=g;
        min=b;
      }
      else{
        max=b;
        min=g;
      }
      if(min==0)
      {
        System.out.println(max);
        continue;
      }
      if(max%(min+1)==0)
      {
        System.out.println(max/(min+1));
        continue;
      }
      else
      {
        System.out.println((max/(min+1)+1));
        continue;
      }
      }
    }
  }

        