import java.util.Scanner;
public class Main355A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    String result="";
    int d=sc.nextInt();
    if(d==0)
    {
      if(k==1)
      {
        System.out.println(0);
      }
      else
        System.out.println("No solution");
    }
    else
    {
      result=d+"";
      for(int i=0;i<k-1;i++)
        result=result+0+"";
      System.out.println(result);
    }
  }
}