import java.util.Scanner;
public class Main4
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int[] res=new int[t];
    for(int i=0;i<t;i++)
    {
      int a =sc.nextInt();
      
      res[i]=nextPal(a);
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(res[i]);
    }
  }
  
  public static int nextPal(int a)
  {
    int j=a+1;
    while(true)
    {
      if(isItPal(j)) return j;
      j++;
    }
  }
  
  public static boolean isItPal(int a)
  {
    int b=a;
    int res=0;
    while(a>0)
    {
      res=res*10+a%10;
      a/=10;
    }
    if(res==b) return true;
    else return false;
    
  }
}