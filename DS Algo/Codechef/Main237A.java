import java.util.Scanner;
public class Main262B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int ans=0;
    int count=0;
    for(int i=0;i<n;i++)
    {
      if(counter<k)
      {
        ans+=Math.abs(sc.nextInt());
        counter++;
      }
      else
        ans+=sc.nextInt();
    }
    System.out.println(ans);
  }
}
      
  