import java.util.Scanner;
public class UVA110044
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int m=sc.nextInt();
      int ans=((n-1)*(m-1))/9+2;
      System.out.println(ans);
    }
  }
}
      
                       
                       
  