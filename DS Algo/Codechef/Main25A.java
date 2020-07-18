import java.util.Scanner;
public class Main25A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //int[] a=new int[n];
    int even=0;
    int even_id=0;
    
    int odd=0;
    int odd_id=0;
    
    for(int i=1;i<=n;i++)
    {
      int x=sc.nextInt();
      if(x%2==0)
      {
        even++;
        even_id=i;
      }
      else
      {
        odd++;
        odd_id=i;
      }
    }
    if(even==1)
      System.out.println(even_id);
    else
      System.out.println(odd_id);
  }
}
           
        