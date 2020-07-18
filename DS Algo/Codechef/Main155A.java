import java.util.Scanner;
public class Main155A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int even=0;
    int odd=0;
    for(int i=0;i<n;i++)
    {
      int value=sc.nextInt();
      sum+=value;
      if(value%2==0)
        even++;
      else
        odd++;
    }
    if(sum%2==0)
    {
      System.out.println(even);
    }
    else
    {
      System.out.println(odd);
    }
  }
}
                           
    