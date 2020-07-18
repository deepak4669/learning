import java.util.Scanner;
public class Main11001
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a==0&&b==0) break;
      double max=0;
      int bound=(a/b);
      for(int i=1;i<=bound;i++)
      {
        double length=(i)*(0.3)*Math.sqrt((a/i)-b);
        if(length>max) max=length;
      }
      System.out.println(max);
    }
  }
}


  