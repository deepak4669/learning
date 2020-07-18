import java.util.Scanner;
public class Main10
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    
    String[] res=new String[t];
    for(int i=0;i<t;i++)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(notLying(a,b))
      {
        res[i]="No Number";
      }
      else
      {
        res[i]=coordinates(a,b);
      }
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
  public static boolean notLying(int a,int b)
  {
    if(a==b||b==(a-2)) return false;
    return true;
  }
  public static String coordinates(int a, int b)
  {
    int res;
   if(a%2==0) res=a+b;
   else res=(a+b-1);
    return String.valueOf(res);
  }
}
      
      