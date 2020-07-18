import java.util.Scanner;
public class Main11498
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    while(true)
    {
      int t=sc.nextInt();
      if(t==0) break;
      int n=sc.nextInt();
      int m=sc.nextInt();
      while(t-->0){
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x==n||y==m)
          System.out.println("divisa");
        else if(y>m)
        {
        if(x>n) System.out.println("NE");
        else System.out.println("NO");
        }
        else
        {
        if(x>n) System.out.println("SE");
        else System.out.println("SO");
        }
      }
  }
  }
}
        
                       
                       
    