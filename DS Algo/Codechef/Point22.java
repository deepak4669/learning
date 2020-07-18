import java.util.Scanner;
public class Point22
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n-->0)
    {
      int px=sc.nextInt();
      int py=sc.nextInt();
      int qx=sc.nextInt();
      int qy=sc.nextInt();
      System.out.println((2*qx-px)+" " +(2*qy-py));
    }
  }
}
      
      
      
        
                           