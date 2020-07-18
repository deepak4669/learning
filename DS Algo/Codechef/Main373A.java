import java.util.Scanner;
public class Main373A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int capacity=2*k;
    int[] a=new int[10];
    boolean flag=true;
    for(int i=0;i<4;i++)
    {
      String s=sc.next();
      for(int j=0;j<4;j++)
      {
        if(s.substring(j,j+1).equals("."))
          continue;
        else
        {
          a[Integer.parseInt(s.substring(j,j+1))]++;
          
        }
      }
    }
    for(int i=1;i<10;i++)
    {
      if(a[i]>capacity)
        flag=false;
    }
    if(flag)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}
    
      
          