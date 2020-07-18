import java.util.Scanner;
public class Main8
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int i=1;
    int j=1;
    int res=0;
    for(i=1;i*j!=t;i++)
    {
      for( j=i;j<=t;j++)
      {
        
        res++;
        if(i*j==t) break;
      }
      
    }
    System.out.println(res);
  }
}
      
      